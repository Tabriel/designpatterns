package org.kama.decorator;

public class TrollFactory implements CreatureFactory {
    @Override
    public Creature getCreature() {
        return new Troll();
    }
}
