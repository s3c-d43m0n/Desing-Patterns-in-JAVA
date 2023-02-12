package com.designpattern.structural.adapter;

import com.designpattern.structural.adaptee.Nintendo;
import com.designpattern.structural.target.GamingConsole;

public class NintendoAdapter implements GamingConsole {

    private Nintendo nintendo;

    public NintendoAdapter(Nintendo nintendo){
        this.nintendo=nintendo;
    }
    @Override
    public void receiveInput() {
        nintendo.nintendoInputReceive();
    }

    @Override
    public void displayOutput() {
        nintendo.nintendoOutputDisplay();
    }
}
