package com.designpattern.integration.service;

import com.designpattern.integration.model.Message;

import java.util.concurrent.BlockingQueue;

public class MessageProcessor extends Thread{
    private BlockingQueue<Message> source;
    private BlockingQueue<Message> destination;
    private WiretapService wiretapService;

    public MessageProcessor(BlockingQueue<Message> source, BlockingQueue<Message> destination){
        this.source=source;
        this.destination=destination;
        //Create new wiretap service for intercepting the data
        wiretapService=new WiretapService();
        //Starting message processor thread
        this.start();
    }

    @Override
    public void run() {
        while(true){
            // Get message from src
            Message message = source.poll();
            if(message!=null) {
                // Wiretap message
                wiretapService.wiretap(message);
                // Push to destination
                destination.offer(message);
            }
        }
    }
}
