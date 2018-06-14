package org.kama.observer;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class Weather {

    private WeatherType currentWeather;
    private final List<WheatherObserver> observers;

    public Weather() {
        currentWeather = WeatherType.SUNNY;
        this.observers = new ArrayList<>();
    }

    public void addObserver(WheatherObserver observer) {
        observers.add(observer);
    }

    public void timePasses() {

        val enumValues = WeatherType.values();

        val currentWeatherPosition = currentWeather.ordinal();
        val nextWeatherPosition = (currentWeatherPosition + 1) % enumValues.length;

        currentWeather = enumValues[nextWeatherPosition];

        System.out.println("Weather changed to " + currentWeather.name());

        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(currentWeather));
    }
}
