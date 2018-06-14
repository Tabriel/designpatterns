package org.kama.creational.prototype.ro;

import org.kama.creational.prototype.Mage;

public class RomanianMage extends Mage {

    private final String superpower;

    public RomanianMage(String superpower) {
        this.superpower = superpower;
    }

    RomanianMage(RomanianMage model) {
        this.superpower = model.superpower;
    }

    @Override
    public Mage copy() throws CloneNotSupportedException {
        return new RomanianMage(this);
    }

    @Override
    public String toString() {
        return superpower;
    }
}
