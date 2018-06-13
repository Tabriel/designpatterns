package org.kama.factorymethodcar;

public enum CarType {

    TESLA_S("Tesla S"), TESLA_Z("Tesla Z"), UNDEFINED("");

    private String name;

    CarType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
