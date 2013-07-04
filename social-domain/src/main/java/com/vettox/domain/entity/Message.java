package com.vettox.domain.entity;

import com.vettox.api.entity.IMessage;

import java.util.Date;

/**
 * The class Message.
 * <p/>
 * User: Vitaliy
 * Date: 04.07.13
 */
public class Message implements IMessage {

    private String messageUid;

    private String conversationUid;

    private String authorUid;

    private String messageText;

    private Date messageDatetime;

    @Override
    public String getMessageUid() {
        return messageUid;
    }

    @Override
    public void setMessageUid(String messageUid) {
        this.messageUid = messageUid;
    }

    @Override
    public String getConversationUid() {
        return conversationUid;
    }

    @Override
    public void setConversationUid(String conversationUid) {
        this.conversationUid = conversationUid;
    }

    @Override
    public String getAuthorUid() {
        return authorUid;
    }

    @Override
    public void setAuthorUid(String authorUid) {
        this.authorUid = authorUid;
    }

    @Override
    public String getMessageText() {
        return messageText;
    }

    @Override
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public Date getMessageDatetime() {
        return messageDatetime;
    }

    @Override
    public void setMessageDatetime(Date messageDatetime) {
        this.messageDatetime = messageDatetime;
    }
}
