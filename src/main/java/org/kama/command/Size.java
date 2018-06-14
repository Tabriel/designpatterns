package org.kama.command;

public enum Size {

    SMALL, LARGE, MEDIUM;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
