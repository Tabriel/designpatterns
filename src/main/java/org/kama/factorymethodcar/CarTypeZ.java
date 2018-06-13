package org.kama.factorymethodcar;

public class CarTypeZ implements Car {

    private CarType carType;

    public CarTypeZ(CarType carType) {
        this.carType = carType;
    }

    @Override
    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return carType.toString();
    }

}
