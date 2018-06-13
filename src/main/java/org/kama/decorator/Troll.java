package org.kama.decorator;

import lombok.Setter;

public class Troll implements Creature {

    private final String fleeBattleMessage = "Troll left the battle.";
    private final String attackMessage = "A troll attacks you.";
    private final int attackPower = 5;

    @Override
    public String attack() {
        return attackMessage;
    }

    @Override
    public Integer getAttackPower() {
        return attackPower;
    }

    @Override
    public String fleeBattle() {
        return fleeBattleMessage;
    }
}
