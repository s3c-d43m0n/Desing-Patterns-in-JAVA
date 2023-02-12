package com.designpattern.structural.client;

import com.designpattern.structural.target.GamingConsole;

public class Client {
    private GamingConsole console;

    public GamingConsole getConsole() {
        return console;
    }

    public void setConsole(GamingConsole console) {
        this.console = console;
    }

    public void playConsole(){
        System.out.println("Receiving Input for Console");
        console.receiveInput();

        System.out.println("Displaying Output from Console");
        console.displayOutput();
    }
}
