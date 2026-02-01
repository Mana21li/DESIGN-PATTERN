package com.manali.observerPattern.observer.pushStrategy;

import com.manali.observerPattern.observable.WeatherData;

public class ForecastConditionDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Forecast WeatherData updated temp: " + weatherData.getTemperature() + ", humidity: " + weatherData.getHumidity() + ", pressure: " + weatherData.getPressure());
    }
}
