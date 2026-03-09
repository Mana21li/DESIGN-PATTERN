package com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.factory.BurgerFactory;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.Burger;

public class Main {
    public static void main(String[] args) {
        String burgerType = "standard";

        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(burgerType);
        burger.prepareBurger();
    }
}
