package com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification;

public class SimpleNotification implements Notification {
    private String text;

    public SimpleNotification(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }
}
