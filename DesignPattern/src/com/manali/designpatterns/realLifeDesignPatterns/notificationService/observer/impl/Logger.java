package com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.impl;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observable.impl.NotificationObservable;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.Observer;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.service.NotificationService;

public class Logger implements Observer {
    private NotificationObservable  notificationObservable;

    public Logger() {
        this.notificationObservable = NotificationService.getInstance().getNotificationObservable();
        notificationObservable.addObserver(this);
    }

    public Logger(NotificationObservable notificationObservable) {
        notificationObservable.addObserver(this);
        this.notificationObservable = notificationObservable;
    }

    @Override
    public void update() {
        System.out.println("Logging new Notification: \n" + notificationObservable.getNotificationContent());
    }
}
