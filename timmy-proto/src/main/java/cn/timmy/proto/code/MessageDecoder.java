package cn.timmy.proto.code;

import com.google.protobuf.MessageLite;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cn.timmy.proto.utils.ParseMap;

/**
 * 解码器
 */
public class MessageDecoder extends ByteToMessageDecoder {

    private static final Logger logger = LogManager.getLogger(MessageDecoder.class);

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        in.markReaderIndex();
        if (in.readableBytes() < 4) {
            logger.info("readableBytes length less than 4 bytes, ignored");
            in.resetReaderIndex();
            return;
        }
        int length = in.readInt();
        if (length < 0) {
            ctx.close();
            logger.error("message length less than 0, channel closed");
            return;
        }
        if (length > in.readableBytes() - 4) {
            in.resetReaderIndex();
            return;
        }
        int ptoNum = in.readInt();
        ByteBuf byteBuf = Unpooled.buffer(length);
        in.readBytes(byteBuf);
        try {
            byte[] body = byteBuf.array();
            MessageLite msg = ParseMap.getMessage(ptoNum, body);
            out.add(msg);
            logger.info("Received Message remoteAddress:{}, content:{}, ptoNum:{}",
                ctx.channel().remoteAddress(), msg.toString(),
                ptoNum);
        } catch (Exception e) {
            logger.error("{},decode failed:{}", ctx.channel().remoteAddress(), e);
        }
    }
}