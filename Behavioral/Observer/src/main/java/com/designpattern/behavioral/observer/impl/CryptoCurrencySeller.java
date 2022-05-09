package com.designpattern.behavioral.observer.impl;

import com.designpattern.behavioral.observer.Observer;
import com.designpattern.behavioral.subject.impl.CryptoCurrency;

public class CryptoCurrencySeller implements Observer {
    private String name;
    private CryptoCurrency coin;
    private final Double sellPrice;
    private final Object stocks;

    public CryptoCurrencySeller(String name, CryptoCurrency coin, Double sellPrice, Double stocks){
        this.name=name;
        this.coin = coin;
        this.sellPrice = sellPrice;
        this.stocks = stocks;
        coin.addObserver(this);
    }

    @Override
    public void notification() {
        if(coin.getPrice()>= sellPrice){
            System.out.println("["+name+"]: Calling External API to sell:"+coin.getName()+" with stocks:"+stocks);
            coin.removeObserver(this);
        }
        else{
            System.out.println("["+name+"]: Waiting for price rise till:"+ sellPrice);
        }
    }
}
