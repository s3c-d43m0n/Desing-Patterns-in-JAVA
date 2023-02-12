package com.designpattern.structural;

import com.designpattern.structural.adaptee.Nintendo;
import com.designpattern.structural.adaptee.PlayStation;
import com.designpattern.structural.adaptee.Xbox;
import com.designpattern.structural.adapter.NintendoAdapter;
import com.designpattern.structural.adapter.PlayStationAdapter;
import com.designpattern.structural.adapter.XboxAdapter;
import com.designpattern.structural.client.Client;
import com.designpattern.structural.target.GamingConsole;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        Xbox xbox = new Xbox();
        GamingConsole xboxAdapter = new XboxAdapter(xbox);
        client.setConsole(xboxAdapter);
        client.playConsole();

        System.out.println();

        PlayStation playStation = new PlayStation();
        GamingConsole playStationAdapter = new PlayStationAdapter(playStation);
        client.setConsole(playStationAdapter);
        client.playConsole();

        System.out.println();

        Nintendo nintendo = new Nintendo();
        GamingConsole nintendoAdapter = new NintendoAdapter(nintendo);
        client.setConsole(nintendoAdapter);
        client.playConsole();
    }
}