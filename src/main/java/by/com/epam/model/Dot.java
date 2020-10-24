package by.com.epam.model;

public class Dot {

    private final double coordinateX;
    private final double coordinateY;
    private final double coordinateZ;

    public Dot(double coordinateX , double coordinateY , double coordinateZ){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }
}
