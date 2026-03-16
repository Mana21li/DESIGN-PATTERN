package com.manali.designpatterns.realLifeDesignPatterns.notificationService.observable.impl;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.Notification;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observable.Observable;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private Notification notification = null;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
        notifyObservers();
    }

    public String getNotificationContent() {
        return notification.getContent();
    }
}
