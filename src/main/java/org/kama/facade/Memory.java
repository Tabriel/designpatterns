package org.kama.facade;

public class Memory {

    public void load(Integer position, byte[] data) {
        System.out.println(
                String.format("Loading data %s from position %d", String.valueOf(data), position & 0xFFF)
        );
    }

    public void unload() {
        System.out.println("System memory unloaded.");
    }
}
