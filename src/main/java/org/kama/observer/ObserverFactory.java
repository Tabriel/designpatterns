package org.kama.observer;

public class ObserverFactory {

    public static WheatherObserver createObserver(String name) {
        return currentWeather -> {
            switch (currentWeather) {
                case COLD:
                    System.out.println("Cold for " + name);
                    break;
                case RAINY:
                    System.out.println("Rainy for " + name);
                    break;
                case SUNNY:
                    System.out.println("Sunny for " + name);
                    break;
                case WINDY:
                    System.out.println("Windy for " + name);
                    break;
                default:
                    break;

            }
        };
    }

    public static WheatherObserver createHobbitObserver(String name) {
        return currentWeather -> {
            switch (currentWeather) {
                case COLD:
                    System.out.println("Hobbit cold " + name);
                    break;
                case RAINY:
                    System.out.println("Hobbit rainy " + name);
                    break;
                case SUNNY:
                    System.out.println("Hobbit sunny " + name);
                    break;
                case WINDY:
                    System.out.println("Hobbit windy " + name);
                    break;
                default:
                    break;

            }
        };
    }
}
