package org.kama.adaptor;

public class BoatFactory {

    public static RowingBoat createSmallBoat() {
        return new SmallBoat();
    }

    public static MotorBoat createMotorBoat() {
        return new MotorBoat();
    }

    //new stuff
    public static RowingBoat createAdaptedMotorBoat(final MotorBoat motorBoat) {

        return new MotorBoatAdapter(motorBoat);
    }

}
