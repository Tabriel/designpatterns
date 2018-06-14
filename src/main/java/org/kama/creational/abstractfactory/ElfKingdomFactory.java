package org.kama.creational.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory {

    private static final String TYPE = "Elf";

    @Override
    public Castle createCastle() {

        return new ElfCastle();
    }

    @Override
    public King createKing() {

        return () -> TYPE + " king";
    }

    @Override
    public Army createArmy() {

        return () -> TYPE + " army";
    }
}
