package com.raven.common.dubbo;

public interface MessageService {
    void singleMsgSend(String msg);
    void groupMsgSend(String msg);
}