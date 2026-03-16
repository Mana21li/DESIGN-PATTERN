package com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.concreteStrategy;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.NotificationStrategy;

public class PopUpStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Popup Notification: \n" + content);
    }
}
