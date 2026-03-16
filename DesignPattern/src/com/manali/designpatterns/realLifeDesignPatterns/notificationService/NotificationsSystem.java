package com.manali.designpatterns.realLifeDesignPatterns.notificationService;

import com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator.impl.SignatureDecorator;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.decorator.impl.TimeStampDecorator;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.Notification;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.notification.SimpleNotification;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.impl.Logger;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.observer.impl.engine.NotificationEngine;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.service.NotificationService;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.concreteStrategy.EmailStrategy;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.concreteStrategy.PopUpStrategy;
import com.manali.designpatterns.realLifeDesignPatterns.notificationService.strategies.concreteStrategy.SMSStrategy;

public class NotificationsSystem {
    public static void main(String[] args) {
        NotificationService notificationService = NotificationService.getInstance();

        Logger logger = new Logger();

        NotificationEngine notificationEngine = new NotificationEngine();

        notificationEngine.addNotificationStrategy(new EmailStrategy("dummy@gmai.com"));
        notificationEngine.addNotificationStrategy(new SMSStrategy("+91 9876543210"));
        notificationEngine.addNotificationStrategy(new PopUpStrategy());

        Notification notification = new SimpleNotification("Your order has been placed");
        notification = new TimeStampDecorator(notification);
        notification = new SignatureDecorator(notification, "Customer Care");

        notificationService.sendNotification(notification);
    }
}
