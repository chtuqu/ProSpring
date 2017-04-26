package com.chtuqu.prospring.ch3.annotation_context.model.renderer.impl;

import com.chtuqu.prospring.ch3.annotation_context.model.provider.MessageProvider;
import com.chtuqu.prospring.ch3.annotation_context.model.renderer.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class " + this.getClass().getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Inject
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
