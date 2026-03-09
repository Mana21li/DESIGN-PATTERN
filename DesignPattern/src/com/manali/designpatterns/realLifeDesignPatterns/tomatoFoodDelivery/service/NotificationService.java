package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.service;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.MenuItem;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.Order;

import java.util.List;

public class NotificationService {
    public void notify(Order order) {
        System.out.println("New " + order.getType() + " is Placed Successfully.");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getUser().getName());
        System.out.println("Restaurant:  " + order.getRestaurant().getName());
        System.out.println("Items Ordered:");

        List<MenuItem> items = order.getItems();
        for (MenuItem item : items) {
            System.out.println("  -" + item.getName() + " (Rs: " + item.getPrice() + ")");
        }
        System.out.println("Total Price: Rs" + order.getTotalPrice());
        System.out.println("Scheduled for: " + order.getScheduled());
        System.out.println("Payment Done");
        System.out.println("---------------------------------------------");
    }
}
