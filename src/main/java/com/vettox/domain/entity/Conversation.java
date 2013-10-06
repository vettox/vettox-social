package com.vettox.domain.entity;

import com.vettox.api.entity.IConversation;
import com.vettox.api.entity.IMessage;

import java.util.List;

/**
 * The class Conversation.
 * <p/>
 * User: Vitaliy
 * Date: 04.07.13
 */
public class Conversation implements IConversation {

    private String conversationUid;

    private String firstUserUid;

    private String secondUserUid;

    private List<IMessage> messages;

    @Override
    public String getConversationUid() {
        return conversationUid;
    }

    @Override
    public void setConversationUid(String conversationUid) {
        this.conversationUid = conversationUid;
    }

    @Override
    public String getFirstUserUid() {
        return firstUserUid;
    }

    @Override
    public void setFirstUserUid(String firstUserUid) {
        this.firstUserUid = firstUserUid;
    }

    @Override
    public String getSecondUserUid() {
        return secondUserUid;
    }

    @Override
    public void setSecondUserUid(String secondUserUid) {
        this.secondUserUid = secondUserUid;
    }

    @Override
    public List<IMessage> getMessages() {
        return messages;
    }

    @Override
    public void setMessages(List<IMessage> messages) {
        this.messages = messages;
    }
}
