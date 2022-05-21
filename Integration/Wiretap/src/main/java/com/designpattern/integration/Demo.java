package com.designpattern.integration;

import com.designpattern.integration.model.Message;
import com.designpattern.integration.service.MessageProcessorSwitch;
import com.designpattern.integration.service.ReceiverService;
import com.designpattern.integration.service.SenderService;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        BlockingQueue<Message> source = new LinkedBlockingQueue<>();
        BlockingQueue<Message> destination = new LinkedBlockingQueue<>();
        try {
            // Message Processor Service
            new MessageProcessorSwitch(source,destination);
            // Receiver service
            new ReceiverService(destination);
            //New to wait till sender is finished with dumping data hence using join
            new SenderService(source).join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
