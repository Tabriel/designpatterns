package org.kama.facade.mine;

import java.util.ArrayList;
import java.util.List;

public class MineFacade {

    private final List<PiticMuncitorInMina> workers;

    public MineFacade() {
        workers = new ArrayList<>();

        workers.add(new PiticLenes("L1"));
        workers.add(new PiticLenes("L2"));

        workers.add(new PiticMuncitor("M1"));
        workers.add(new PiticMuncitor("M2"));
        workers.add(new PiticMuncitor("M3"));
        workers.add(new PiticMuncitor("M4"));
        workers.add(new PiticMuncitor("M5"));
        workers.add(new PiticMuncitor("M6"));


        workers.add(new PiticManager("B1"));
        workers.add(new PiticManager("B2"));
    }

    public void startNewDay() {
        workers.forEach(pitic -> {
            pitic.wakeUp();
            pitic.goToMine();
        });
    }

    public void digOutGold() {
        workers.forEach(pitic -> {
            pitic.work();
        });
    }

    public void makeSureSnowWhiteStillAlive() {
        System.out.println("Snow white still alive.");
    }

    public void endDay() {
        workers.forEach(pitic -> {
            pitic.work();
            pitic.work();
            System.out.println("OK, go home now.");
            pitic.goHome();
        });
    }
}
