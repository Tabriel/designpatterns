package org.kama.proxy;

public class TowerFactory {

    public static WizardTower createTower(Integer capacity) {

        return  new TowerProxy(new BlackTower(), capacity);
    }

    public static WizardTower createBlackTower() {

        return  new TowerProxy(new BlackTower());
    }
}
