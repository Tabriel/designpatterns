package org.kama.creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void saySomething() {
        System.out.println("Enum singletong");
    }

}
