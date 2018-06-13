package org.kama.abstractfactory;

public class ElfCastle implements Castle {

    private final String ELF_CASTLE = "Elf castle.";

    @Override
    public String getDescription() {
        return ELF_CASTLE;
    }
}
