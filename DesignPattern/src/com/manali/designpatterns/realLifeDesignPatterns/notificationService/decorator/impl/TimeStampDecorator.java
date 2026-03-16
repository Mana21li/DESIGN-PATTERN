package com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator.impl;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator.NotificationDecorator;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.Notification;

public class TimeStampDecorator extends NotificationDecorator {

    public TimeStampDecorator(Notification notification) {
        super(notification);
    }

    public String getContent() {
        return "[2026-03-16 12:00:00] " + this.notification.getContent();
    }
}
