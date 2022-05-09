package com.designpattern.behavioral.subject;

import com.designpattern.behavioral.observer.Observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
