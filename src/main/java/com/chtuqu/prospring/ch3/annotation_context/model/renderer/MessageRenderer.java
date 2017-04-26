package com.chtuqu.prospring.ch3.annotation_context.model.renderer;

import com.chtuqu.prospring.ch3.annotation_context.model.provider.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
