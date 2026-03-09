package com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.factory;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}
