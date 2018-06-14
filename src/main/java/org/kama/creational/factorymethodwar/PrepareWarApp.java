package org.kama.creational.factorymethodwar;

public class PrepareWarApp {

    private final Fierar fierar;

    public PrepareWarApp(Fierar fierar) {
        this.fierar = fierar;
    }

    private static PrepareWarApp createDacicArmy () {
        return new PrepareWarApp(new FierarDac());
    }

    private static PrepareWarApp createJapanezeArmy () {
        return new PrepareWarApp(new FierarJaponez());
    }

    public static void main(String... args) {
        PrepareWarApp dacicArmy = createDacicArmy();
        dacicArmy.manufactureWeapons();

        PrepareWarApp japaneseArmy = createJapanezeArmy();
        japaneseArmy.manufactureWeapons();
    }

    private void manufactureWeapons() {

        Weapon weapon1 = fierar.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon1.toString());

        Weapon weapon2 = fierar.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon2.toString());
    }
}
