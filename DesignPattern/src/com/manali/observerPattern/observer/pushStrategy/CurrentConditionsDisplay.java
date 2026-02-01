package com.manali.observerPattern.observer.pushStrategy;

import com.manali.observerPattern.observable.WeatherData;

public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Current WeatherData updated temp: " + weatherData.getTemperature() + ", humidity: " + weatherData.getHumidity() + ", pressure: " + weatherData.getPressure());
    }
}
