package com.manali.factoryPattern.simpleFactoryPattern.impl;

import com.manali.factoryPattern.simpleFactoryPattern.Shape;

public class Square implements Shape {
    public void computeArea() {
        System.out.println("Square Area");
    }

    public void draw() {
        System.out.println("Square draw");
    }
}
