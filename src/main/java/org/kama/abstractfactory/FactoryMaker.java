package org.kama.abstractfactory;

public class FactoryMaker {

    public static KingdomFactory makeFactory(KingdomType type) {

        switch(type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("Kingdom type not supported yet.");
        }
    }

    public static KingdomFactory makeFactory(String type) {

        return makeFactory(KingdomType.valueOf(type));

    }
}
