package com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator.impl;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator.NotificationDecorator;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.Notification;

public class SignatureDecorator extends NotificationDecorator {
    private String signature;

    public SignatureDecorator(Notification notification, String signature) {
        super(notification);
        this.signature = signature;
    }

    public String getContent() {
        return notification.getContent() + "\n--- " + signature + "\n\n";
    }
}
