package com.vettox.api.entity;

import java.util.Date;

/**
 * The interface IMessage.
 * <p/>
 * User: Vitaliy
 * Date: 04.07.13
 */
public interface IMessage {
    String getMessageUid();

    void setMessageUid(String messageUid);

    String getConversationUid();

    void setConversationUid(String conversationUid);

    String getAuthorUid();

    void setAuthorUid(String authorUid);

    String getMessageText();

    void setMessageText(String messageText);

    Date getMessageDatetime();

    void setMessageDatetime(Date messageDatetime);
}
