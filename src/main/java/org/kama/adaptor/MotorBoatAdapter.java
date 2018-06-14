package org.kama.adaptor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MotorBoatAdapter implements RowingBoat {

    private final MotorBoat adaptedBoat;

    @Override
    public void row() {
        adaptedBoat.startEngine();
    }
}
