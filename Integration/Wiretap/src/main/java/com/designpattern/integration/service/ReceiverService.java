package com.designpattern.integration.service;

import com.designpattern.integration.model.Message;

import java.util.concurrent.BlockingQueue;

public class ReceiverService extends Thread{

    private BlockingQueue<Message> queue;

    public ReceiverService(BlockingQueue<Message> queue){
        this.queue=queue;
        // Start receiver thread
        this.start();
    }

    private void process(Message message){
        System.out.println("[ReceiverService]: processing "+message);
    }


    @Override
    public void run() {
        while (true){
            // Get message from queue
            Message receivedMessage = queue.poll();
            if(receivedMessage!=null) {
                process(receivedMessage);
            }
        }
    }
}
