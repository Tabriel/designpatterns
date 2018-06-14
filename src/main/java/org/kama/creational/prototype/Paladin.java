package org.kama.creational.prototype;

public abstract class Paladin extends Prototype {

    @Override
    public abstract Paladin copy() throws CloneNotSupportedException;
}
