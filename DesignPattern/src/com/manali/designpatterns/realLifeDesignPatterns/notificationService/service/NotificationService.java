package com.manali.designpatterns.realLifeDesignPatterns.notificationService.service;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.Notification;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observable.impl.NotificationObservable;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private NotificationObservable notificationObservable;
    private static NotificationService instance = null;
    private List<Notification>  notifications =  new ArrayList<>();

    private NotificationService() {
        notificationObservable = new NotificationObservable();
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public NotificationObservable getNotificationObservable() {
        return notificationObservable;
    }

    public void sendNotification(Notification notification) {
        notifications.add(notification);
        notificationObservable.setNotification(notification);
    }
}
