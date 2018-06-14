package org.kama.facade.mine;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PiticLenes implements PiticMuncitorInMina {

    private final String name;

    @Override
    public void wakeUp() {
        System.out.println("Trezirea cu greu.");
    }

    @Override
    public void goToMine() {
        System.out.println("Drum spre mina, o doamne!");
    }

    @Override
    public void work() {
        System.out.println("Munca grea, prea grea..");
    }

    @Override
    public void goHome() {
        System.out.println("In sfarsit plec acasa. Eeeeee!");
    }
}
