package org.kama.facade.mine;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PiticManager implements PiticMuncitorInMina {

    private final String name;

    @Override
    public void wakeUp() {
        System.out.println("Trezire de manager.");
    }

    @Override
    public void goToMine() {
        System.out.println("Drum spre mina ca un boss.");
    }

    @Override
    public void work() {
        System.out.println("Munca e munca pentru ceilalti.");
    }

    @Override
    public void goHome() {
        System.out.println("Plec acasa mai devreme.");
    }
}
