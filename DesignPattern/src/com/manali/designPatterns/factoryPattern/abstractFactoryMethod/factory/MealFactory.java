package com.manali.designPatterns.factoryPattern.abstractFactoryMethod.factory;

import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;
import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}
