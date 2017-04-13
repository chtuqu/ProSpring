package com.chtuqu.prospring.ch2.third.renderer.impl;

import com.chtuqu.prospring.ch2.third.provider.MessageProvider;
import com.chtuqu.prospring.ch2.third.renderer.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class " + this.getClass().getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
