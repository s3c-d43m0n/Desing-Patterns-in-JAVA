package com.designpattern.integration.service;

import com.designpattern.integration.model.Message;
import com.designpattern.integration.utility.MessageCloneUtil;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class WiretapService extends Thread{
    private BlockingQueue<Message> queue;

    public WiretapService(){
        this.queue = new LinkedBlockingQueue<>();
        // Start wiretap interceptor thread
        this.start();
    }

    public void wiretap(Message message){
        // Need to deep clone as we dont want any modification in data
        Message clonedMessage = MessageCloneUtil.deepClone(message);
        // Push for processing
        queue.offer(clonedMessage);
    }

    @Override
    public void run() {
        while(true){
            // Get intercepted message from queue
            Message message = queue.poll();
            if(message!=null) {
                //TODO: Process message
                System.out.println("[WiretapService]: intercepted " + message);
            }
        }
    }
}
