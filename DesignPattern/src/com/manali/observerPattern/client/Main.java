package com.manali.observerPattern.client;

import com.manali.observerPattern.push.observable.WeatherObservable;
import com.manali.observerPattern.push.observable.WeatherStation;
import com.manali.observerPattern.push.observer.CurrentConditionsDisplay;
import com.manali.observerPattern.push.observer.ForecastConditionDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("##### Observer Design Pattern! #####");
        System.out.println("##### Push Design Pattern! #####");

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
