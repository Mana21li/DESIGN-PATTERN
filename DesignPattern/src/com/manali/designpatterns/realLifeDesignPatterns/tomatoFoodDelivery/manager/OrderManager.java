package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.manager;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    List<Order> orders =  new ArrayList<>();

    private static class Holder {
        private static final OrderManager INSTANCE = new OrderManager();
    }

    private OrderManager() {
    }

    public static OrderManager getInstance() {
        return Holder.INSTANCE;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void listOrders() {
        System.out.println("------ All Orders ------");
        for (Order order : orders) {
            System.out.println(order.getType() + " order for " + order.getUser().getName());
            System.out.println(" | Total Price : Rs" + order.getTotalPrice());
            System.out.println(" At: " + order.getScheduled());
        }
    }
}
