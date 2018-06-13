package org.kama.prototype;

import org.kama.prototype.ro.RomanianMage;
import org.kama.prototype.ro.RomanianPaladin;
import org.kama.prototype.ro.RomanianRonaldo;
import org.kama.prototype.ro.RomanianSamsar;

import java.util.Optional;

public class App {

    public static void main (String... args) {
/*        HeroFactory factory = new HeroFactory(
                new RomanianMage("nonee"),
                new RomanianPaladin("fly"),
                new RomanianSamsar("steal"),
                new RomanianRonaldo("clubbing")
        );*/

        HeroFactory factory = HeroFactory.builder()
                .withMage(new RomanianMage("none"))
                .withPaladin(new RomanianPaladin("fly"))
                .withSamsar(new RomanianSamsar("steal"))
                .withRonaldo(new RomanianRonaldo("clubbing"))
                .build();

        Optional<Mage> mage = factory.createMage();

        if (mage.isPresent()) {
            System.out.println(mage.get().toString());
        }
    }
}
