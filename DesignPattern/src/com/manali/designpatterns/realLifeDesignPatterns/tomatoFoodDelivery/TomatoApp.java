package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.factory.OrderFactory;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.factory.factoryImpl.NowOrderFactory;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.factory.factoryImpl.ScheduleOrderFactory;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.manager.OrderManager;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.manager.RestaurantManager;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.*;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.service.NotificationService;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.PaymentStrategy;

import java.util.List;

public class TomatoApp {

    public TomatoApp() {
        initializeRestaurant();
    }

    public void initializeRestaurant() {
        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.setMenu(new MenuItem("M1", "Chole Bhature", 140));
        restaurant1.setMenu(new MenuItem("M2", "Samosa", 50));

        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.setMenu(new MenuItem("M1", "Pav Bhaji", 120));
        restaurant2.setMenu(new MenuItem("M2", "Vada Pav", 30));
        restaurant2.setMenu(new MenuItem("M3", "Kachori", 25));

        Restaurant restaurant3 = new Restaurant("Sarvana Bhavan", "Chennai");
        restaurant3.setMenu(new MenuItem("M1", "Idli", 60));
        restaurant3.setMenu(new MenuItem("M2", "Plain Dosa", 120));
        restaurant3.setMenu(new MenuItem("M3", "Masala Dosa", 150));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }

    public List<Restaurant> searchRestaurant(String restaurantAddress) {
        return RestaurantManager.getInstance().getRestaurantsByAddress(restaurantAddress);
    }

    public void selectRestaurant(User user, Restaurant restaurant) {
        Cart cart = user.getCart();
        cart.setRestaurant(restaurant);
    }

    public void addToCart(User user, String itemCode) {
        Restaurant restaurant = user.getCart().getRestaurant();
        if(restaurant == null) {
            System.out.println("Please select a restaurant first");
            return;
        }
        for(MenuItem item : restaurant.getMenu()) {
            if (item.getCode().equals(itemCode)) {
                user.getCart().addItem(item);
                break;
            }
        }
    }

    public Order checkoutNow(User user, String orderType, PaymentStrategy paymentStrategy) {
        return checkout(user, orderType, paymentStrategy, new NowOrderFactory());
    }

    public Order checkoutScheduled(User user, String orderType, PaymentStrategy paymentStrategy, String scheduleTime) {
        return checkout(user, orderType, paymentStrategy, new ScheduleOrderFactory(scheduleTime));
    }


    public Order checkout(User user, String orderType, PaymentStrategy paymentStrategy,
                          OrderFactory orderFactory) {
        if(user.getCart() == null) {
            return null;
        }

        Cart userCart = user.getCart();
        Restaurant orderedRestaurant = userCart.getRestaurant();
        List<MenuItem> orderedItems = userCart.getItems();
        double orderCost = userCart.getTotalPrice();

        Order order = orderFactory.createOrder(user, userCart, orderedRestaurant, orderedItems, paymentStrategy, orderType);
        OrderManager.getInstance().addOrder(order);

        return order;
    }

    public void payForOrder(User user, Order order) {
        boolean isPaymentSuccess = order.processPayment();

        //clear card when order successful
        if(isPaymentSuccess) {
            NotificationService notificationService =  new NotificationService();
            notificationService.notify(order);
            user.getCart().clear();
        }
    }

    public void printUserCart(User user) {
        System.out.println("Items in cart: ");
        System.out.println("----------------------------------");
        for(MenuItem item : user.getCart().getItems()) {
            System.out.println(item.getCode() + " : " + item.getName() + " Rs" +  item.getPrice());
        }
        System.out.println("----------------------------------");
        System.out.println("Grand Total : Rs" + user.getCart().getTotalPrice());
    }
}
