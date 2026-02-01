package com.manali.observerPattern.observable.pullStrategy;

import com.manali.observerPattern.observable.WeatherData;
import com.manali.observerPattern.observer.pullStrategy.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    private List<WeatherObserver> observers;
    //observable data
    private WeatherData weatherData;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setWeatherReadings(float temp, float humidity, float pressure) {
        this.weatherData = new WeatherData(temp, humidity, pressure);
        notifyObservers();
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }
}
