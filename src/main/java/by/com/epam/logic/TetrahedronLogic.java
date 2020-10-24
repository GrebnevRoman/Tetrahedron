package by.com.epam.logic;

import by.com.epam.model.Tetrahedron;

import java.math.*;

public class TetrahedronLogic {
    private double squareOfTriangle(double firstSide, double secondSide, double thirdSide) {
        double perimeter = firstSide + secondSide + thirdSide;
        return Math.sqrt(perimeter * (perimeter - firstSide) * (perimeter - secondSide) * (perimeter - thirdSide));
    }

    public double calculateSquare(Tetrahedron tetrahedron) {
        double firstSide = squareOfTriangle(tetrahedron.getFirstEdge(), tetrahedron.getSecondEdge(), tetrahedron.getFourthEdge());
        double secondSide = squareOfTriangle(tetrahedron.getFirstEdge(), tetrahedron.getThirdEdge(), tetrahedron.getSixthEdge());
        double thirdSide = squareOfTriangle(tetrahedron.getSecondEdge(), tetrahedron.getThirdEdge(), tetrahedron.getFifthEdge());
        double fourthSide = squareOfTriangle(tetrahedron.getFourthEdge(), tetrahedron.getFifthEdge(), tetrahedron.getSixthEdge());
        return firstSide + secondSide + thirdSide + fourthSide;
    }

    public double calculateValue(Tetrahedron tetrahedron) {
        double firstEdgePow = Math.pow(tetrahedron.getFirstEdge(), 2);
        double secondEdgePow = Math.pow(tetrahedron.getSecondEdge(), 2);
        double thirdEdgePow = Math.pow(tetrahedron.getThirdEdge(), 2);
        double fourthEdgePow = Math.pow(tetrahedron.getFourthEdge(), 2);
        double fifthEdgePow = Math.pow(tetrahedron.getFifthEdge(), 2);
        double sixthEdgePow = Math.pow(tetrahedron.getSixthEdge(), 2);

        return Math.sqrt((fourthEdgePow * thirdEdgePow * (fifthEdgePow + sixthEdgePow + secondEdgePow + firstEdgePow - fourthEdgePow -
                thirdEdgePow) + fifthEdgePow * firstEdgePow * (thirdEdgePow + sixthEdgePow + secondEdgePow + fourthEdgePow -
                fifthEdgePow - firstEdgePow) + sixthEdgePow * secondEdgePow * (thirdEdgePow + firstEdgePow + fifthEdgePow + fourthEdgePow -
                sixthEdgePow - secondEdgePow) - (secondEdgePow*thirdEdgePow*fifthEdgePow + fourthEdgePow*sixthEdgePow*fifthEdgePow +
                fourthEdgePow*secondEdgePow*firstEdgePow + thirdEdgePow*sixthEdgePow*firstEdgePow)));
    }

    ;

}
