package com.designpattern.behavioral.subject.impl;

import com.designpattern.behavioral.observer.Observer;
import com.designpattern.behavioral.subject.Subject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CryptoCurrency implements Subject {
    private String name;
    private Double price;
    private List<Observer> subsribers;

    public CryptoCurrency(String name, Double price) {
        this.name = name;
        this.price = price;
        subsribers = new CopyOnWriteArrayList<>();
    }

    public String getName() { return name; }

    public Double getPrice() { return price; }

    public void setPrice(Double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer newSubscriber) {
        subsribers.add(newSubscriber);
    }

    @Override
    public void removeObserver(Observer oldSubscriber) {
        subsribers.remove(oldSubscriber);
    }

    @Override
    public void notifyObservers() {
        for(Observer subscriber : subsribers){
            subscriber.notification();
        }
    }
}
