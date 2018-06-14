package org.kama.facade;

public class CPU {

    public void freeze() {
        System.out.println("CPU freeze.");
    }

    public void execute(String instr) {
        System.out.println(
                String.format("CPU execute %s.", instr)
        );
    }

    public void jump(Integer to) {
        System.out.println(
                String.format("CPU jump to %d.", to)
        );
    }
}
