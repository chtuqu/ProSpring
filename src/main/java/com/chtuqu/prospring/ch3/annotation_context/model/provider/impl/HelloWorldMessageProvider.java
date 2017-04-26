package com.chtuqu.prospring.ch3.annotation_context.model.provider.impl;

import com.chtuqu.prospring.ch3.annotation_context.model.provider.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello, World!";
    }
}
