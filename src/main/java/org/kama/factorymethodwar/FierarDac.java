package org.kama.factorymethodwar;

public class FierarDac implements Fierar {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {

        return new AramDeDac(weaponType);
    }
}
