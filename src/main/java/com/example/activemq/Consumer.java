package com.example.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by sunming on 2019/6/13.
 */
@Component
public class Consumer {

    @JmsListener(destination = "test.queue")
    public void receiveQueue(String text){
        System.out.println("收到的消息为:"+text);
    }
}
