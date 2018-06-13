package org.kama.decorator;

import java.util.function.Function;

public class CreatureUpgrader implements Creature {

    private int attackPower;
    private String fleeMode;
    private String attackMode;
    //decorated
    private Creature creature;

    private CreatureUpgrader(Builder builder) {
        this.attackMode = builder.attackMode;
        this.attackPower = builder.attackPower;
        this.fleeMode = builder.fleeMode;
        this.creature = builder.creature;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String attack() {
        String newAttackMode = String.format("New attack mode is %s.", this.attackMode);
        return creature.attack() + newAttackMode;
    }

    @Override
    public int getAttackPower() {
        return  creature.getAttackPower() + this.attackPower;
        //return amplifier.apply(creature.attack());

    }

    @Override
    public String fleeBattle() {
        String newFleeMode = String.format("New flee mode is %s.", this.fleeMode);
        return creature.fleeBattle() + newFleeMode;
    }

    public static class Builder {
        private int attackPower;
        private String fleeMode;
        private String attackMode;
        private Creature creature;


        private static final Function IDENTITTY_FUNCTION = x -> x;
        private Function<String, String> upgradeAttack();
        private Function<String, String> upgradeFlee();
        private Function<Integer, Integer> upgradePower();

        public Builder withCreature(Creature creature) {
            this.creature = creature;
            return this;
        }

        public Builder withAttackMode(Function<String, String> func) {
            checkNull(func).apply(creature.attack());
            this.attackMode = attackMode;
            return this;
        }

        public Builder upgradePower(int attackPower) {
            this.attackPower = attackPower;
            return this;
        }

        public Builder withFleeMode(String fleeMode) {
            this.fleeMode = fleeMode;
            return this;
        }

        public CreatureUpgrader build() {
            return new CreatureUpgrader(this);
        }


        private <T> Function<T, T> checkNull(Function<T, T> function) {
            if (function == null) {
                return IDENTITTY_FUNCTION
            }
            return function;
        }
    }
}
