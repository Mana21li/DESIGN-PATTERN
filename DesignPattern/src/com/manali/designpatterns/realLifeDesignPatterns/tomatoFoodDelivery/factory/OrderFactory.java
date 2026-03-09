package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.factory;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.*;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.PaymentStrategy;

import java.util.List;

public interface OrderFactory {
    Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
                      PaymentStrategy paymentStrategy, String orderType);
}
