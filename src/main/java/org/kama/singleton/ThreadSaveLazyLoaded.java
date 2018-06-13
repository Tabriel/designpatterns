package org.kama.singleton;

public class ThreadSaveLazyLoaded {
    private static ThreadSaveLazyLoaded instance;

    private ThreadSaveLazyLoaded() {}

    public static synchronized ThreadSaveLazyLoaded getInstance() {

        if (instance == null) {
            instance = new ThreadSaveLazyLoaded();
        }

        return instance;
    }
}
