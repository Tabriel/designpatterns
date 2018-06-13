package org.kama.decorator;

public interface Creature {

    String attack();
    int getAttackPower();
    String fleeBattle();

    default void doTheThing() {
        System.out.println("== Drumm sound ==");
        System.out.println(this.attack());
        System.out.println("Power : " + this.getAttackPower());
        System.out.println(this.fleeBattle());
        System.out.println("== Fin ==");
    }
}
