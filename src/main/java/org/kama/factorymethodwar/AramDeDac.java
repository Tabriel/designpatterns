package org.kama.factorymethodwar;

public class AramDeDac implements Weapon {

    private WeaponType weaponType;

    public AramDeDac(WeaponType weaponType) {
        this.weaponType = weaponType;
    }


    @Override
    public WeaponType getWeaponType() {
        return  weaponType;
    }

    @Override
    public String toString() {
        return String.format("%s dacica", weaponType.toString());
    }

}
