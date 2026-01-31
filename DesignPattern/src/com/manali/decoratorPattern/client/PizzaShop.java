package com.manali.decoratorPattern.client;

import com.manali.decoratorPattern.component.BasePizza;
import com.manali.decoratorPattern.component.concreteComponent.FarmhousePizza;
import com.manali.decoratorPattern.component.concreteComponent.PlainPizza;
import com.manali.decoratorPattern.decorator.CheeseToping;
import com.manali.decoratorPattern.decorator.MushroomTopping;

public class PizzaShop {

    public static void main(String[] args) {
        //create plain pizza
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1: " + pizza1.getDescription() + "= Rs" + pizza1.getCost());

        //Add toppings to plain pizza
        BasePizza pizza2 = new CheeseToping(new PlainPizza());
        System.out.println("Order 2: " + pizza2.getDescription() + "= Rs" + pizza2.getCost());

        //create farmhouse pizza
        BasePizza pizza3 = new FarmhousePizza();
        System.out.println("Order 2: " + pizza3.getDescription() + "= Rs" + pizza3.getCost());

        //create farmhouse pizza with mushroom and cheese
        BasePizza pizza4 = new MushroomTopping(new CheeseToping(new FarmhousePizza()));
        System.out.println("Order 4: " + pizza4.getDescription() + "= Rs" + pizza4.getCost());


    }

}
