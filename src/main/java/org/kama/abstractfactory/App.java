package org.kama.abstractfactory;

import java.util.Scanner;

public class App {


    private Army army;
    private Castle castle;
    private King king;

    public static void main(String... args) {

        Scanner keyboard =  new Scanner(System.in);
        System.out.print("Choose kingdom type: ");
        String option = keyboard.nextLine();


        //KingdomFactory factory = FactoryMaker.makeFactory(KingdomType.ELF);
        KingdomFactory factory = FactoryMaker.makeFactory(option);

        App app1 = new App();

        app1.createKingdom(factory);
        System.out.println(app1.getArmy(factory).getDescription());
        System.out.println(app1.getCastle(factory).getDescription());
        System.out.println(app1.getKing(factory).getDescription());

    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    private void createKingdom(KingdomFactory factory) {

        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    private void setArmy(Army army) {
        this.army = army;
    }

    private void setCastle(Castle castle) {
        this.castle = castle;
    }

    private void setKing(King king) {
        this.king = king;
    }
}
