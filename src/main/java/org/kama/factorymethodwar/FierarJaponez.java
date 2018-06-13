package org.kama.factorymethodwar;

public class FierarJaponez implements Fierar {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {

        return new ArmaDeSamurai(weaponType);
    }
}
