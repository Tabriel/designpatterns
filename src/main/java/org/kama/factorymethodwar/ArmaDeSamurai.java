package org.kama.factorymethodwar;

public class ArmaDeSamurai implements Weapon{

    private WeaponType weaponType;

    public ArmaDeSamurai(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return  weaponType;
    }

    @Override
    public String toString() {
        return String.format("%s samurai", weaponType.toString());
    }
}
