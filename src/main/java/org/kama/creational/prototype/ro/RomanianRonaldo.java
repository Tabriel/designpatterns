package org.kama.creational.prototype.ro;

import org.kama.creational.prototype.Ronaldo;

public class RomanianRonaldo extends Ronaldo {

    private final String superpower;

    public RomanianRonaldo(String superpower) {
        this.superpower = superpower;
    }

    RomanianRonaldo(RomanianRonaldo model) {
        this.superpower = model.superpower;
    }

    @Override
    public Ronaldo copy() throws CloneNotSupportedException {
        return new RomanianRonaldo(this);
    }

    @Override
    public String toString() {
        return superpower;
    }
}
