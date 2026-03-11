package com.manali.designpatterns.behaviouralDesignPattern.observerPattern;

import com.manali.designpatterns.behaviouralDesignPattern.observerPattern.impl.Channel1;
import com.manali.designpatterns.behaviouralDesignPattern.observerPattern.impl.Subscriber1;

public class Main {
    public static void main(String[] args) {
        Channel1 channel1 = new Channel1("abc");

        Subscriber1 subscriber1 = new Subscriber1("Abhi", channel1);
        Subscriber1 subscriber2 = new Subscriber1("Maya", channel1);

        channel1.subscribe(subscriber1);
        channel1.subscribe(subscriber2);

        channel1.uploadVideo("observer pattern");

        channel1.unsubscribe(subscriber1);

        channel1.uploadVideo("Deco Pattern");

    }
}
