package org.kama.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class TowerFactory {

    public static WizardTower createBlackTower(Integer capacity) {

        return  new TowerProxy(new BlackTower(), capacity);
    }

    public static WizardTower createBlackTower() {

        return  new TowerProxy(new BlackTower());
    }

    //new stuff
    public static WizardTower createTower() {

        Handler handler = new Handler(new BlackTower());
        Class<BlackTower> clazz = BlackTower.class;

        return (WizardTower) Proxy.newProxyInstance(TowerFactory.class.getClassLoader(), clazz.getInterfaces(), handler);
    }
}

//new stuff
class Handler implements InvocationHandler {

    private final WizardTower instance;
    private Integer capacity = 5;
    private Integer wizardCount = 0;

    Handler(WizardTower wizardTower, Integer capacity) {
        this.instance = wizardTower;
        this.capacity = capacity;
    }

    Handler(WizardTower wizardTower) {
        this.instance = wizardTower;
    }

    @Override
    public  Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        if (method.getName().equalsIgnoreCase("enter")) {
            if (roomAvailable()) {
                result = method.invoke(instance, capacity);
                wizardCount += 1;
            } else {
                Wizard wizard = (Wizard)args[0];
                System.out.println(
                        String.format("Tower is full, %s!", wizard.getName())
                );
            }
        }

        //Object result = method.invoke(instance, args);

        return result;
    }

    private boolean roomAvailable() {
        return wizardCount < capacity;
    }
}
