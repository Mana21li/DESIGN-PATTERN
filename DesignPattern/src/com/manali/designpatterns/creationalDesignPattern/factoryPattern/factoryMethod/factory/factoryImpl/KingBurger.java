package com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.factoryImpl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl.BasicWheatBurger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl.PremiumWheatBurger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl.StandardWheatBurger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.BurgerFactory;

public class KingBurger implements BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if("basic".equalsIgnoreCase(type)){
            return new BasicWheatBurger();
        } else if("standard".equalsIgnoreCase(type)){
            return new StandardWheatBurger();
        } else if("premium".equalsIgnoreCase(type)){
            return new PremiumWheatBurger();
        } else {
            System.out.println("Wheat Burger not found");
            return null;
        }
    }
}
