package com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.factory;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.Burger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.impl.BasicBurger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.impl.PremiumBurger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.impl.StandardBurger;

public class BurgerFactory {
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        } else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        } else if(type.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        } else {
            System.out.println("Invalid Burger Type");
            return null;
        }
    }
}
