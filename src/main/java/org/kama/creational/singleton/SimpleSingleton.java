package org.kama.creational.singleton;

public class SimpleSingleton {

    //public static final SimpleSingleton INSTANCE  = new SimpleSingleton();
    private static SimpleSingleton INSTANCE;

    private Integer count = 0;

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Patterns!");
    }

    public void increment() {
        this.count += 1;
    }

    public Integer getCount() {
        return this.count;
    }
}
