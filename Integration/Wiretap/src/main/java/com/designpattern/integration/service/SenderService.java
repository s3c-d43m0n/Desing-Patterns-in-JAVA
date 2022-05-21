package com.designpattern.integration.service;

import com.designpattern.integration.model.Message;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class SenderService extends Thread{
    private long messageId;
    private Random random;
    private BlockingQueue<Message> queue;

    public SenderService(BlockingQueue<Message> queue){
        messageId=101;
        random=new Random();
        this.queue=queue;
        //Starting SenderService thread
        this.start();
    }

    private Message getMessage(){
        Message message = new Message(messageId++, "Data "+random.nextInt(1000));
        System.out.println("[Sender]: generating "+message);
        return message;
    }

    @Override
    public void run() {
        //Publish 5 Message to QUEUE
        for(int i=1; i<=5; i++){
            queue.offer(getMessage());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
