package com.chtuqu.prospring.ch2.third.renderer;

import com.chtuqu.prospring.ch2.third.provider.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
