package com.manali.designpatterns.behaviouralDesignPattern.observerPattern.impl;

import com.manali.designpatterns.behaviouralDesignPattern.observerPattern.Subscriber;

public class Subscriber1 implements Subscriber {
    private String name;
    private Channel1 channel1;

    public Subscriber1(String name, Channel1 channel1) {
        this.name = name;
        this.channel1 = channel1;
    }

    @Override
    public void update() {
        System.out.println("Hey "+ name + "," + channel1.getLatestVideo());
    }
}
