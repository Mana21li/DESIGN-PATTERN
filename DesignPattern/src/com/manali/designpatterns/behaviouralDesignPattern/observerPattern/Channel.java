package com.manali.designpatterns.behaviouralDesignPattern.observerPattern;

public interface Channel {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers();
}
