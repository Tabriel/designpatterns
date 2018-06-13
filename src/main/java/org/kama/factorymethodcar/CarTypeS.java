package org.kama.factorymethodcar;

public class CarTypeS implements Car {

    private CarType carType;

    public CarTypeS(CarType carType) {
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
