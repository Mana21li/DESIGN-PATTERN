package com.manali.observerPattern.client;

import com.manali.observerPattern.observable.pushStrategy.WeatherObservable;
import com.manali.observerPattern.observable.pushStrategy.WeatherStation;
import com.manali.observerPattern.observer.pushStrategy.CurrentConditionsDisplay;
import com.manali.observerPattern.observer.pushStrategy.ForecastConditionDisplay;

public class PushStrategy {
    public static void main(String[] args) {
        System.out.println("##### Observer Design Pattern! #####");
        System.out.println("##### Push Design Pattern! #####");

        //push strategy
        //create weather station (observable/subject)
        WeatherObservable weatherStation = new WeatherStation();

        //create observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForecastConditionDisplay forecastDisplay = new ForecastConditionDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forecastDisplay);

        weatherStation.setWeatherReadings(30f, 4f, 65f);

        weatherStation.removeObserver(forecastDisplay);
    }
}
