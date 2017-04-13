package com.chtuqu.prospring.ch2.fourth;

import com.chtuqu.prospring.ch2.third.provider.MessageProvider;
import com.chtuqu.prospring.ch2.third.renderer.MessageRenderer;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageProvider provider;
    private MessageRenderer renderer;

    public MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("msf.properties"));

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
