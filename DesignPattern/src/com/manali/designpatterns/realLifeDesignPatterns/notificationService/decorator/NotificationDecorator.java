package com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.Notification;

public abstract class NotificationDecorator implements Notification {
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }
}
