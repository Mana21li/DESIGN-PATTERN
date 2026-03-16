package com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.concreteStrategy;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.NotificationStrategy;

public class EmailStrategy implements NotificationStrategy {
    private String emailId;

    public EmailStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("Sending email Notification to: " + emailId + "\n" + content);
    }
}
