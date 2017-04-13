package com.chtuqu.prospring.ch2.third.provider.impl;

import com.chtuqu.prospring.ch2.third.provider.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello, World!";
    }
}
