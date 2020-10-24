package by.com.epam.model;

import by.com.epam.logic.TetrahedronLogic;

public class TetrahedronParameters {

    private final double square;
    private final double volume;

    public TetrahedronParameters(double square, double volume) {
        this.square = square;
        this.volume = volume;
    }

    public double getSquare() {
        return square;
    }

    public double getVolume() {
        return volume;
    }
}
