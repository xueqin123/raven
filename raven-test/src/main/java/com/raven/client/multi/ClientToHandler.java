package com.raven.client.multi;

import com.raven.common.protos.Message.*;
import com.raven.common.protos.Message.RavenMessage.Type;
import com.raven.common.utils.JsonHelper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static com.raven.client.common.Utils.*;

@Slf4j
public class ClientToHandler extends SimpleChannelInboundHandler<RavenMessage> {

    private ChannelHandlerContext messageConnectionCtx;

    private String uid;
    private String token;
    private static boolean flag = true;

    public ClientToHandler(String uid, String token) {
        super(true);
        this.uid = uid;
        this.token = token;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws IOException {
        messageConnectionCtx = ctx;
        sendLogin(ctx, token);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RavenMessage message) throws Exception {
        if (message.getType() == Type.LoginAck) {
            LoginAck loginAck = message.getLoginAck();
            log.info("login ack:{}", JsonHelper.toJsonString(loginAck));
            if (loginAck.getCode() == Code.SUCCESS) {
                log.info("waiting for incoming messages.");
            }
            sendHeartBeat(ctx);
        } else if (message.getType() == Type.MessageAck) {
            MessageAck messageAck = message.getMessageAck();
            log.info("receive message ack:{}", JsonHelper.toJsonString(messageAck));
        } else if (message.getType() == Type.UpDownMessage) {
            UpDownMessage upDownMessage = message.getUpDownMessage();
            log.info("receive down message:{}", JsonHelper.toJsonString(upDownMessage));
            MessageAck messageAck = MessageAck.newBuilder()
                    .setId(upDownMessage.getId())
                    .setCode(Code.SUCCESS)
                    .setTime(System.currentTimeMillis())
                    .build();
            RavenMessage ravenMessage = RavenMessage.newBuilder().setType(Type.MessageAck)
                    .setMessageAck(messageAck).build();
            ctx.writeAndFlush(ravenMessage);
            if (uid.equals(ClientToDevice1.CLIENT_UID) && flag) {
                sendMsg(ctx, uid, upDownMessage.getConvId(), true);
                flag = false;
            }
        } else if (message.getType() == Type.HeartBeat) {
            rspHeartBeat(ctx, message.getHeartBeat());
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        if ("Connection reset by peer".equals(cause.getMessage())) {
            return;
        }
        log.error(cause.getMessage(), cause);
    }
}
