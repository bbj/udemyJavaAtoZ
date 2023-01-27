package com.bbj.app;

/**
 * Ford does not need to implement Serializable as Car is doing it.
 */
public class Ford extends Car {

    private String fordType;

    //as there is no default constructor in Car, we have to match the one in super class here
    public Ford(String carBrand, int motorNumber, String color, String fordType) {
        super(carBrand, motorNumber, color);
        this.fordType = fordType;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "fordType='" + fordType + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", motorNumber=" + motorNumber +
                ", color='" + color + '\'' +
                '}';
    }
}
