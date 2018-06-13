package org.kama.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TowerProxy implements WizardTower {

    private WizardTower tower;
    private Integer capacity;

    private Integer wizardCount = 0;

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
