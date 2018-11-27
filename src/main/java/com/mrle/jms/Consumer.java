package com.mrle.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "test.q")
    public void receiveMsg(String text) throws InterruptedException {
        System.out.println("<<<<<<========= 收到消息：" + text);
        Thread.sleep(1000);
    }
}
