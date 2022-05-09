package com.designpattern.behavioral.observer.impl;

import com.designpattern.behavioral.observer.Observer;
import com.designpattern.behavioral.subject.impl.CryptoCurrency;

public class CryptoCurrencyBuyer implements Observer {
    private String name;
    private CryptoCurrency coin;
    private final Double buyPrice;
    private final Object stocks;

    public CryptoCurrencyBuyer(String name, CryptoCurrency coin, Double buyPrice, Double stocks){
        this.name=name;
        this.coin = coin;
        this.buyPrice = buyPrice;
        this.stocks = stocks;
        coin.addObserver(this);
    }

    @Override
    public void notification() {
        if(coin.getPrice()<=buyPrice){
            System.out.println("["+name+"]: Calling External API to buy:"+coin.getName()+" with stocks:"+stocks);
            coin.removeObserver(this);
        }
        else{
            System.out.println("["+name+"]: Waiting for price drop till:"+buyPrice);
        }
    }
}
