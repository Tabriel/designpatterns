package org.kama.observer;

import lombok.val;

public class App {

    public static void main(String[] args) {

        val weather = new Weather();

        weather.addObserver(ObserverFactory.createObserver("SImple"));
        weather.addObserver(ObserverFactory.createHobbitObserver("Harry"));

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
