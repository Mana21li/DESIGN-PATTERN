package com.manali.factoryPattern.factoryMethodPattern.impl;

import com.manali.factoryPattern.factoryMethodPattern.Shape;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Square compute area");
    }

    @Override
    public void draw() {
        System.out.println("Square draw");
    }
}
