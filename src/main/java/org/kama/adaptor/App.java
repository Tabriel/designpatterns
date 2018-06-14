package org.kama.adaptor;

import lombok.val;

import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        val motorboat = BoatFactory.createMotorBoat();

        val captain = new Captain(BoatFactory.createSmallBoat());

        captain.setMyBoat(new MotorBoatAdapter(motorboat));

        captain.setMyBoat(BoatFactory.createAdaptedMotorBoat(motorboat));

        //captain.setMyBoat( motorboat -> motorboat.startEngine() );

        captain.sail();

        Stream.of("gigi", "ion", "io").forEach(System.out::println);
    }
}
