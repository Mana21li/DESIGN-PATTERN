package com.manali.observerPattern.client;

import com.manali.observerPattern.observable.pullStrategy.WeatherObservable;
import com.manali.observerPattern.observable.pullStrategy.WeatherStation;
import com.manali.observerPattern.observer.pullStrategy.CurrentConditionsDisplay;
import com.manali.observerPattern.observer.pullStrategy.ForecastConditionDisplay;

public class PullStrategy {
    public static void main(String[] args) {
        System.out.println("##### Observer Design Pattern! #####");
        System.out.println("##### Push Design Pattern! #####");
        //pull strategy
        WeatherObservable weatherStation = new WeatherStation();

        //create observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastConditionDisplay forecastDisplay = new ForecastConditionDisplay(weatherStation);

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forecastDisplay);

        weatherStation.setWeatherReadings(30f, 4f, 65f);

        weatherStation.removeObserver(forecastDisplay);
    }
}
