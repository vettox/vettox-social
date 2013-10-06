package com.vettox.api.entity;

import java.util.List;

/**
 * The interface IConversation.
 * <p/>
 * User: Vitaliy
 * Date: 04.07.13
 */
public interface IConversation {
    String getConversationUid();

    void setConversationUid(String conversationUid);

    String getFirstUserUid();

    void setFirstUserUid(String firstUserUid);

    String getSecondUserUid();

    void setSecondUserUid(String secondUserUid);

    List<IMessage> getMessages();

    void setMessages(List<IMessage> messages);
}
