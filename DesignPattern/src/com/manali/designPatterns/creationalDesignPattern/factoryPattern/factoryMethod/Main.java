package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.BurgerFactory;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.factoryImpl.KingBurger;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.factoryImpl.SinghBurger;

public class Main {
    public static void main(String[] args) {
        String burgerType = "basic";

        BurgerFactory burgerFactory = new SinghBurger();
        Burger burger = burgerFactory.createBurger(burgerType);
        burger.prepareBurger();

        burgerFactory = new KingBurger();
        burger = burgerFactory.createBurger(burgerType);
        burger.prepareBurger();
    }
}
