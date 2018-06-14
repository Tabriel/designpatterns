package org.kama.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BlackTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {

        System.out.println(String.format("Wizard %s enters the tower.", wizard.getName()));
    }
}
