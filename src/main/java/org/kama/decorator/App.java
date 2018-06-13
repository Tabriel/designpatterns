package org.kama.decorator;

import lombok.val;

public class App {

    public static void main(String... args) {

        //TODO create a Creature factory : DONE here
        val troll = new TrollFactory().getCreature();
        val samurai = new SamuraiFactory().getCreature();

        //TODO create an upgrade Creature upgrade : DONE here
//        val upCreature = CreatureUpgrader.upgrade()
//                .withCreature(troll)
//                .withAttackMode("fiercly")
//                .upgradePower(17)
//                .withFleeMode("very scared")
//                .build();

        //troll.doTheThing();
        //upCreature.doTheThing();

        //upgrade troll
        //val middleTroll = new MiddleLevelCreature(troll);
        //doTheThing(middleTroll);

//        val upSamurai = CreatureUpgrader.upgrade()
//                .withCreature(samurai)
//                .withAttackMode(x -> String.format("The best Samurai %s", x))
//                .upgradePower(x -> x * x)
//                .withFleeMode("horified")
//                .build();

//        upSamurai.doTheThing();

        val upTroll = CreatureUpgrader.upgrade(troll)
                .withAttackMode(a -> String.format("With great power %s and no shame", a))
                .upgradePower(x -> x*x)
                .build();

        troll.doTheThing();
        upTroll.doTheThing();
    }
}

