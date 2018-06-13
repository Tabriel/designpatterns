package org.kama.decorator;

//actual decorator
public class MiddleLevelCreature implements Creature {

    private final Creature decorated;
    private final String fleeBattleMessage = "Middle creature left the battle.";
    private final String attackMessage = "Middle creature attacks you.";

    MiddleLevelCreature(Creature decorated) {
        this.decorated = decorated;
    }

    @Override
    public String attack() {
        return decorated.attack() + attackMessage;
    }

    @Override
    public Integer getAttackPower() {
        return decorated.getAttackPower() + 5;
    }

    @Override
    public String fleeBattle() {
        return decorated.fleeBattle() +  fleeBattleMessage;
    }
}
