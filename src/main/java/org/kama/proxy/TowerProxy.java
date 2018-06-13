package org.kama.proxy;


import lombok.RequiredArgsConstructor;


public class TowerProxy implements WizardTower {

    private WizardTower tower;
    private Integer capacity = 5;

    private Integer wizardCount = 0;

    TowerProxy(WizardTower wizardTower, Integer capacity) {
        this.tower = wizardTower;
        this.capacity = capacity;
    }

    TowerProxy(WizardTower wizardTower) {
        this.tower = wizardTower;
        this.capacity = capacity;
    }

    @Override
    public void enter(Wizard wizard) {
        if (roomAvailable()) {
            tower.enter(wizard);
            wizardCount += 1;
        } else {
            System.out.println(
                    String.format("Sorry %s! The tower is full.", wizard.getName())
            );
        }
    }

    private boolean roomAvailable() {
        return wizardCount < capacity;
    }


}
