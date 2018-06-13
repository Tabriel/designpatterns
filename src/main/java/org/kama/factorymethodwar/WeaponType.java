package org.kama.factorymethodwar;

public enum WeaponType {

    SHORT_SWORD("Short sword"), SPEAR("teapa"), AXE("axe"), UNDEFINED("");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
