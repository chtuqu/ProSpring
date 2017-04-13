package com.chtuqu.prospring.ch2.third;

import com.chtuqu.prospring.ch2.third.provider.MessageProvider;
import com.chtuqu.prospring.ch2.third.provider.impl.HelloWorldMessageProvider;
import com.chtuqu.prospring.ch2.third.renderer.MessageRenderer;
import com.chtuqu.prospring.ch2.third.renderer.impl.StandardOutMessageRenderer;

public class DecoupledHelloWorld {
    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
