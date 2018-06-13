package org.kama.decorator;

import lombok.val;

public class App {

    public static void main(String... args) {

        //TODO create a Creature factory : DONE here
        val troll = new TrollFactory().getCreature();
        val samurai = new SamuraiFactory().getCreature();

        //TODO create an upgrade Creature builder : DONE here
        val upCreature = CreatureUpgrader.builder()
                .withCreature(troll)
                .withAttackMode("fiercly")
                .upgradePower(17)
                .withFleeMode("very scared")
                .build();

        //troll.doTheThing();
        //upCreature.doTheThing();

        //upgrade troll
        //val middleTroll = new MiddleLevelCreature(troll);
        //doTheThing(middleTroll);

        val upSamurai = CreatureUpgrader.builder()
                .withCreature(samurai)
                .withAttackMode(x -> String.format("The best Samurai %s", x))
                .upgradePower(x -> x * x)
                .withFleeMode("horified")
                .build();

        upSamurai.doTheThing();
    }
}

