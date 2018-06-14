package org.kama.creational.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {

    private static final String TYPE = "Orc";

    @Override
    public Castle createCastle() {
        return () -> TYPE + " castle";
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
