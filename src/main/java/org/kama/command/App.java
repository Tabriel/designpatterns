package org.kama.command;

import lombok.val;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        val target = new Target(Size.SMALL, Visibility.VISIBILE);

        System.out.println(target);

        val invisibility = new InvisibilitySpell();
        /*invisibility.execute(target);
        target.status();
        invisibility.undo();
        target.status();*/

        val shrink = new ShrinkSpell();
        val keyboard  = new Scanner(System.in);
        Optional<Command> lastSpell = Optional.empty();

        while (true) {
            System.out.println("Say your spell: ");
            val command = keyboard.nextLine().toLowerCase().trim();

            switch (command) {
                case "invisible":
                    invisibility.execute(target);
                    lastSpell = Optional.of(invisibility);
                    break;
                case "shrink":
                    shrink.execute(target);
                    lastSpell = Optional.of(shrink);
                    break;
                case "undo":
                    if (lastSpell.isPresent()) {
                        lastSpell.get().undo();
                    }
                    break;
                default:
                    System.out.printf("Don't know that! Try: 'invisible', 'shrink', 'undo");

                    break;
            }
            target.status();
        }
    }

}
