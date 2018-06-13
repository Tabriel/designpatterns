package org.kama.decorator;

import java.util.function.Function;

public class CreatureUpgrader implements Creature {

    private static final Function IDENTITTY_FUNCTION = x -> x;

    private Function<Integer, Integer> attackPower;
    private Function<String, String> fleeMode;
    private Function<String, String> attackMode;
    //decorated
    private Creature creature;

    private CreatureUpgrader(Builder builder) {
        this.attackMode = builder.attackMode;
        this.attackPower = builder.attackPower;
        this.fleeMode = builder.fleeMode;
        this.creature = builder.creature;
    }


    private <T> Function<T, T> checkNull(Function<T, T> function) {
        if (function == null) {
            return IDENTITTY_FUNCTION;
        }
        return function;
    }

    public static Builder upgrade(Creature creature) {
        return new Builder().withCreature(creature);
    }

    @Override
    public String attack() {
        return checkNull(attackMode).apply(creature.attack());
    }

    @Override
    public Integer getAttackPower() {
        return checkNull(attackPower).apply(creature.getAttackPower());
    }

    @Override
    public String fleeBattle() {
        return checkNull(fleeMode).apply(creature.fleeBattle());
    }

    public static class Builder {

        private Function<Integer, Integer> attackPower;
        private Function<String, String> fleeMode;
        private Function<String, String> attackMode;
        private Creature creature;

        public Builder withCreature(Creature creature) {
            this.creature = creature;
            return this;
        }

        public Builder withAttackMode(Function<String, String> func) {
            this.attackMode = func;
            return this;
        }

        public Builder upgradePower(Function<Integer, Integer> func) {
            this.attackPower = func;
            return this;
        }

        public Builder withFleeMode(Function<String, String> func) {
            this.fleeMode = func;
            return this;
        }

        public CreatureUpgrader build() {
            return new CreatureUpgrader(this);
        }


    }
}
