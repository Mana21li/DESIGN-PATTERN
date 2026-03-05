package com.manali.designPatterns.factoryPattern.abstractFactoryMethod;

import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;
import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;
import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.factory.MealFactory;
import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.factory.factoryImpl.KingFactory;

public class Main {
    public static void main(String[] args) {
        String burgerType = "standard";
        String garlicBreadType = "cheese";

        MealFactory mealFactory = new KingFactory();

        Burger burger = mealFactory.createBurger(burgerType);
        GarlicBread garlicBread = mealFactory.createGarlicBread(garlicBreadType);
        burger.prepare();
        garlicBread.prepare();
    }
}
