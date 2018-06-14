package org.kama.observer;

public enum WeatherType {

    SUNNY, RAINY, WINDY, COLD;

    private String type;

    @Override
    public String toString() {
        return type;
    }
}
