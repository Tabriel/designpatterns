package org.kama.decorator;

import lombok.Setter;

public class Samurai implements Creature {

    private final String fleeBattleMessage = "Samurai left the battle.";
    private final String attackMessage = "A samurai attacks you.";
    private final int attackPower = 5;

    @Override
    public String attack() {
        return attackMessage;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String fleeBattle() {
        return "";
    }
}
