package org.kama.creational.singleton;

public class ThreadSafeDoubleCheck {

    private static ThreadSafeDoubleCheck instance;

    private ThreadSafeDoubleCheck() {}

    public static ThreadSafeDoubleCheck getInstance() {

        ThreadSafeDoubleCheck localInstance = instance;

        if (localInstance == null) {
            synchronized (ThreadSafeDoubleCheck.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ThreadSafeDoubleCheck();
                }
            }
        }
        return localInstance;
    }
}
