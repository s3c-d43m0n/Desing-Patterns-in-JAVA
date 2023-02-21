package com.designpattern.creational;

import com.designpattern.creational.client.EmailSender;

public class Demo {
    public static void main(String[] args){
        //Create Multiple Email Sender Threads
        for(int i=0; i<20; i++){
            new EmailSender(i).start();
        }
    }
}