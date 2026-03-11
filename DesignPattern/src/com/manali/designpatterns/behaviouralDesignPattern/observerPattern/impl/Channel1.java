package com.manali.designpatterns.behaviouralDesignPattern.observerPattern.impl;

import com.manali.designpatterns.behaviouralDesignPattern.observerPattern.Channel;
import com.manali.designpatterns.behaviouralDesignPattern.observerPattern.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel1 implements Channel {
    private String channelName;
    private String latestVideo;
    private List<Subscriber> subscribers;

    public Channel1(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber s) {
        if (!subscribers.contains(s))
            subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update();
        }
    }

    public void uploadVideo(String title) {
        latestVideo = title;
        System.out.println(channelName + " uploaded a new video: " + latestVideo);
        notifySubscribers();
    }

    public String getLatestVideo() {
        return "Checkout our new video: " + latestVideo;
    }
}
