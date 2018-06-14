package org.kama.facade;

import lombok.val;

public class App {

    public static void main(String[] args) {

//        val cpu = new CPU();
//        val hdd = new HardDrive();
//        val memory = new Memory();
//
//        cpu.jump(6455);
//        hdd.read(1, 1000);
//        memory.load(1000, "Started computer".getBytes());

        val computer = new ComputerFacade();
        computer.start();
        System.out.println("working...");
        computer.stop();
    }
}
