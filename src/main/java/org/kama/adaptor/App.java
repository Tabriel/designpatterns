package org.kama.adaptor;

import lombok.val;

public class App {

    public static void main(String[] args) {

        val motorboat = BoatFactory.createMotorBoat();

        val captain = new Captain(BoatFactory.createSmallBoat());
        //captain.setMyBoat(new MotorBoatAdapter(motorboat));
        captain.setMyBoat(BoatFactory.createAdaptedMotorBoat(motorboat));
        captain.sail();
    }
}
