package org.kama.creational.prototype.ro;

import org.kama.creational.prototype.Samsar;

public class RomanianSamsar extends Samsar {

    private final String superpower;

    public RomanianSamsar(String superpower) {
        this.superpower = superpower;
    }

    RomanianSamsar(RomanianSamsar model) {
        this.superpower = model.superpower;
    }

    @Override
    public Samsar copy() throws CloneNotSupportedException {
        return new RomanianSamsar(this);
    }

    @Override
    public String toString() {
        return superpower;
    }
}
