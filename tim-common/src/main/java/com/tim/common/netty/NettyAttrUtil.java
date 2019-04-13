package com.tim.common.netty;

import io.netty.channel.Channel;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

public class NettyAttrUtil {

    private static final AttributeKey<String> ATTR_KEY_READER_TIME = AttributeKey
        .valueOf("readerTime");

    private static final AttributeKey<String> ATTR_KEY_USER_ID = AttributeKey
        .valueOf("uid");

    public static void updateReaderTime(Channel channel, Long time) {
        channel.attr(ATTR_KEY_READER_TIME).set(time.toString());
    }

    public static Long getReaderTime(Channel channel) {
        String value = getAttribute(channel, ATTR_KEY_READER_TIME);
        if (value != null) {
            return Long.valueOf(value);
        }
        return null;
    }

    private static String getAttribute(Channel channel, AttributeKey<String> key) {
        Attribute<String> attr = channel.attr(key);
        return attr.get();
    }

    public static void setAttrKeyUserId(Channel channel, String uid) {
        channel.attr(ATTR_KEY_USER_ID).set(uid);
    }

    public static String getUid(Channel channel) {
        String value = getAttribute(channel, ATTR_KEY_USER_ID);
        if (value != null) {
            return value;
        }
        return null;
    }

}