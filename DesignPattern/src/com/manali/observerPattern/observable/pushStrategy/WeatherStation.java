package com.manali.observerPattern.observable.pushStrategy;

import com.manali.observerPattern.observable.WeatherData;
import com.manali.observerPattern.observer.pushStrategy.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    private List<WeatherObserver> observers;
    private WeatherData weatherData;

    public WeatherStation() {
        this.observers = new ArrayList<>();
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
            observer.update(weatherData);
        }
    }

    public  void setWeatherReadings(float temp, float humidity,  float pressure) {
        this.weatherData = new WeatherData(temp, humidity, pressure);
        notifyObservers();
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }


}
