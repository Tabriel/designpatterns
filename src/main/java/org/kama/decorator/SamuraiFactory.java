package org.kama.decorator;

public class SamuraiFactory implements CreatureFactory {
    @Override
    public Creature getCreature() {
        return new Samurai();
    }
}
