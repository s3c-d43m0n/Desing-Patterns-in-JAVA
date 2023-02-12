package com.designpattern.structural.adapter;

import com.designpattern.structural.adaptee.PlayStation;
import com.designpattern.structural.target.GamingConsole;

public class PlayStationAdapter implements GamingConsole {
    private PlayStation playStation;
    public PlayStationAdapter(PlayStation playStation){
        this.playStation=playStation;
    }

    @Override
    public void receiveInput() {
        playStation.playStationInputReceive();
    }

    @Override
    public void displayOutput() {
        playStation.playStationOutputDisplay();
    }
}
