package org.kama.creational.prototype.ro;

import org.kama.creational.prototype.Paladin;

public class RomanianPaladin extends Paladin {

    private final String superpower;

    public RomanianPaladin(String superpower) {
        this.superpower = superpower;
    }

    RomanianPaladin(RomanianPaladin model) {
        this.superpower = model.superpower;
    }

    @Override
    public Paladin copy() throws CloneNotSupportedException {
        return new RomanianPaladin(this);
    }

    @Override
    public String toString() {
        return superpower;
    }
}