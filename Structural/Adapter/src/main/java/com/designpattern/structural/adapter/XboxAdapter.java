package com.designpattern.structural.adapter;

import com.designpattern.structural.adaptee.Xbox;
import com.designpattern.structural.target.GamingConsole;

public class XboxAdapter implements GamingConsole {
    private Xbox xbox;
    public XboxAdapter(Xbox xbox){
        this.xbox=xbox;
    }

    @Override
    public void receiveInput() {
        xbox.xboxInputReceive();
    }

    @Override
    public void displayOutput() {
        xbox.xboxOutputDisplay();
    }
}
