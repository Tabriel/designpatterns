package org.kama.prototype;

import java.util.Optional;

public class HeroFactory {

    private Mage mage;
    private Paladin paladin;
    private Samsar samsar;
    private Ronaldo ronaldo;

    private HeroFactory(Mage mage, Paladin paladin, Samsar samsar, Ronaldo ronaldo) {
        this.mage = mage;
        this.paladin = paladin;
        this.samsar = samsar;
        this.ronaldo = ronaldo;
    }

    private HeroFactory(Builder builder) {
        this.mage = builder.mage;
        this.paladin = builder.paladin;
        this.samsar = builder.samsar;
        this.ronaldo = builder.ronaldo;
    }

    public Optional<Mage> createMage() {
        try {
            return Optional.of(mage.copy());
        } catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }

    public Optional<Paladin> createPaladin() {
        try {
            return Optional.of(paladin.copy());
        } catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }

    public Optional<Samsar> createSamsar() {
        try {
            return Optional.of(samsar.copy());
        } catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }

    public Optional<Ronaldo> createRonaldo() {
        try {
            return Optional.of(ronaldo.copy());
        } catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Mage mage;
        private Paladin paladin;
        private Samsar samsar;
        private Ronaldo ronaldo;

        public Builder withMage(Mage value) {
            this.mage = value;
            return this;
        }

        public Builder withPaladin(Paladin value) {
            this.paladin = value;
            return this;
        }

        public Builder withSamsar(Samsar value) {
            this.samsar = value;
            return this;
        }

        public Builder withRonaldo(Ronaldo value) {
            this.ronaldo = value;
            return this;
        }

        public HeroFactory build() {
           return new HeroFactory(this);
        }
    }
}
