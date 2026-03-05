package com.manali.designPatterns.factoryPattern.factoryMethod;

import com.manali.designPatterns.factoryPattern.factoryMethod.Service.Burger;
import com.manali.designPatterns.factoryPattern.factoryMethod.Service.impl.BasicBurger;
import com.manali.designPatterns.factoryPattern.factoryMethod.factory.BurgerFactory;
import com.manali.designPatterns.factoryPattern.factoryMethod.factory.factoryImpl.KingBurger;
import com.manali.designPatterns.factoryPattern.factoryMethod.factory.factoryImpl.SinghBurger;

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
