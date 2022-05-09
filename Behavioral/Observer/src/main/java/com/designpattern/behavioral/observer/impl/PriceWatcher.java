package com.designpattern.behavioral.observer.impl;

import com.designpattern.behavioral.observer.Observer;
import com.designpattern.behavioral.subject.impl.CryptoCurrency;

public class PriceWatcher implements Observer {
    String name;
    private Double previousPrice;
    private CryptoCurrency coin;

    public PriceWatcher(String name, CryptoCurrency coin){
        this.name=name;
        this.coin=coin;
        previousPrice=coin.getPrice();
    }

    @Override
    public void notification() {
        System.out.println("["+name+"]: "+coin.getName()+" price changed from "+previousPrice+" to "+coin.getPrice());
        previousPrice=coin.getPrice();
    }
}
