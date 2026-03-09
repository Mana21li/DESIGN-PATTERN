package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.factory.factoryImpl;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.factory.OrderFactory;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.*;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.PaymentStrategy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class NowOrderFactory implements OrderFactory {

    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems, PaymentStrategy paymentStrategy, String orderType) {
        Order order = null;
        if (orderType.equalsIgnoreCase("Delivery")) {
            DeliveryOrder deliveryOrder = new DeliveryOrder();
            deliveryOrder.setUserAddress(user.getAddress());
            order = deliveryOrder;
        }   else {
            PickupOrder pickupOrder = new PickupOrder();
            pickupOrder.setRestaurantAddress(restaurant.getAddress());
            order = pickupOrder;
        }
        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setItems(menuItems);
        order.setPaymentStrategy(paymentStrategy);
        order.setScheduled(LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy")));
        order.setTotalPrice(cart.getTotalPrice());
        return order;
    }
}
