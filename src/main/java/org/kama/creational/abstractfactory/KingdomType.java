package org.kama.creational.abstractfactory;

public enum KingdomType {
    ELF("elf"), ORC("orc");

    private String type;

    KingdomType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
