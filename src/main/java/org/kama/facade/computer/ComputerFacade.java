package org.kama.facade.computer;

public class ComputerFacade {

    private static final Integer BOOT_ADDRESS = 0;
    private CPU cpu;
    private HardDrive hdd;
    private Memory mem;

    //lombok works here?
    public ComputerFacade() {
        cpu = new CPU();
        hdd = new HardDrive();
        mem = new Memory();
    }

    public void start() {
        cpu.freeze();
        mem.load(BOOT_ADDRESS, hdd.read(0, 2000));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute("START");
    }

    public void stop() {
        mem.unload();
        cpu.execute("STOP");
    }
}
