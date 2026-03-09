package com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;

public interface BurgerFactory {
    Burger createBurger(String type);
}
