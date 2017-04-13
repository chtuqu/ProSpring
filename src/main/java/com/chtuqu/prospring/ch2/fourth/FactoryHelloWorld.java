package com.chtuqu.prospring.ch2.fourth;

import com.chtuqu.prospring.ch2.third.provider.MessageProvider;
import com.chtuqu.prospring.ch2.third.renderer.MessageRenderer;

public class FactoryHelloWorld {
    public static void main(String[] args) {
        MessageProvider provider = MessageSupportFactory.getInstance().getProvider();
        MessageRenderer renderer = MessageSupportFactory.getInstance().getRenderer();
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
