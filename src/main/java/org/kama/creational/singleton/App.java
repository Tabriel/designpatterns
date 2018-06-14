package org.kama.creational.singleton;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        SimpleSingleton singleton = SimpleSingleton.getInstance();

        singleton.sayHello();
        singleton.increment();

        SimpleSingleton singleton2 = SimpleSingleton.getInstance();
        singleton.increment();

        System.out.println(singleton2.getCount());
    }
}
