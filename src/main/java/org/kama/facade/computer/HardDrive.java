package org.kama.facade.computer;

public class HardDrive {

    public byte[] read(Integer start, Integer end) {
        System.out.println(
                String.format("Read from %d to %d.", start & 0xFFF, end & 0xFFF)
        );

        return "Boot sequence".getBytes();
    }
}
