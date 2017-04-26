package com.chtuqu.prospring.ch3.xml_context.model.provider.impl;

import com.chtuqu.prospring.ch3.xml_context.model.provider.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello, World!";
    }
}
