package com.manali.factoryPattern.simpleFactoryPattern.impl;

import com.manali.factoryPattern.simpleFactoryPattern.Shape;

public class Circle implements Shape {
    public void computeArea() {
        System.out.println("Circle area");
    }

    public void draw() {
        System.out.println("Circle draw");
    }
}
