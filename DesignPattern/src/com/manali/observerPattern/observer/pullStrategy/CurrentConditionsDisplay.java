package com.manali.observerPattern.observer.pullStrategy;

import com.manali.observerPattern.observable.pullStrategy.WeatherObservable;

public class CurrentConditionsDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public CurrentConditionsDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Current WeatherData updated");
    }
}
