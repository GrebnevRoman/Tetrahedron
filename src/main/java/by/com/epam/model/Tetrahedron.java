package by.com.epam.model;

import by.com.epam.Observer.Observable;
import by.com.epam.Observer.Observer;

import java.util.Objects;

public class Tetrahedron  {

    double firstEdge;
    double secondEdge;
    double thirdEdge;
    double fourthEdge;
    double fifthEdge;
    double sixthEdge;
    private int id;

    private static final Tetrahedron INSTANCE = new Tetrahedron();

    public static Tetrahedron getInstance() {
        return INSTANCE;
    }

    private Tetrahedron() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFifthEdge() {
        return fifthEdge;
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public double getFourthEdge() {
        return fourthEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public double getSixthEdge() {
        return sixthEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    public void setFourthEdge(double fourthEdge) {
        this.fourthEdge = fourthEdge;
    }

    public void setFifthEdge(double fifthEdge) {
        this.fifthEdge = fifthEdge;
    }

    public void setSixthEdge(double sixthEdge) {
        this.sixthEdge = sixthEdge;
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                "firstEdge=" + firstEdge +
                ", secondEdge=" + secondEdge +
                ", thirdEdge=" + thirdEdge +
                ", fourthEdge=" + fourthEdge +
                ", fifthEdge=" + fifthEdge +
                ", sixthEdge=" + sixthEdge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tetrahedron that = (Tetrahedron) o;
        return Double.compare(that.firstEdge, firstEdge) == 0 &&
                Double.compare(that.secondEdge, secondEdge) == 0 &&
                Double.compare(that.thirdEdge, thirdEdge) == 0 &&
                Double.compare(that.fourthEdge, fourthEdge) == 0 &&
                Double.compare(that.fifthEdge, fifthEdge) == 0 &&
                Double.compare(that.sixthEdge, sixthEdge) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstEdge, secondEdge, thirdEdge, fourthEdge, fifthEdge, sixthEdge);
    }


}
