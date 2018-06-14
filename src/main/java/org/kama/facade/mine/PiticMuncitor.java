package org.kama.facade.mine;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PiticMuncitor implements PiticMuncitorInMina {

    private final String name;

    @Override
    public void wakeUp() {
        System.out.println("Trezirea.");
    }

    @Override
    public void goToMine() {
        System.out.println("Drum spre mina.");
    }

    @Override
    public void work() {
        System.out.println("Munca e munca.");
    }

    @Override
    public void goHome() {
        System.out.println("Plec acasa.");
    }
}
