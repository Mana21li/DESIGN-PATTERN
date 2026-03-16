package com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.impl.engine;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observable.impl.NotificationObservable;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.Observer;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.service.NotificationService;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.NotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements Observer {
    private NotificationObservable notificationObservable;
    private List<NotificationStrategy> notificationStrategies = new ArrayList<>();

    public NotificationEngine() {
        this.notificationObservable = NotificationService.getInstance().getNotificationObservable();
        notificationObservable.addObserver(this);
    }

    public NotificationEngine(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
    }

    public void addNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategies.add(notificationStrategy);
    }

    @Override
    public void update() {
        String notificationContent = notificationObservable.getNotificationContent();
        for (NotificationStrategy strategy : notificationStrategies) {
            strategy.sendNotification(notificationContent);
        }
    }
}
