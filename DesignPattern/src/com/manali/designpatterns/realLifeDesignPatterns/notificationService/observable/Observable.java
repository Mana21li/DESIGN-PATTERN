package com.manali.designpatterns.realLifeDesignPatterns.notificationService.observable;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
