package com.manali.designPatterns.creationalDesignPattern.factoryPattern.simplefactory;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.simplefactory.factory.BurgerFactory;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.simplefactory.service.Burger;

public class Main {
    public static void main(String[] args) {
        String burgerType = "standard";

        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(burgerType);
        burger.prepareBurger();
    }
}
