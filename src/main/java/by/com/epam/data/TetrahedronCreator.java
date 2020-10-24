package by.com.epam.data;

import by.com.epam.model.Dot;
import by.com.epam.model.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronCreator {


    public Tetrahedron createTetrahedron(List<String> lines) throws TetrahedronException {
        List<Dot> tetrahedronPoints = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split(" ");
            double xCoordinate = Double.parseDouble(words[0]);
            double yCoordinate = Double.parseDouble(words[1]);
            double zCoordinate = Double.parseDouble(words[2]);

            Dot dot = new Dot(xCoordinate, yCoordinate, zCoordinate);
            tetrahedronPoints.add(dot);
        }
        int points = tetrahedronPoints.size();
        if (points != 4) {
            throw new TetrahedronException("You must have 4 points ");
        }
        Dot firstDot = tetrahedronPoints.get(0);
        Dot secondDot = tetrahedronPoints.get(1);
        Dot thirdDot = tetrahedronPoints.get(2);
        Dot fourthDot = tetrahedronPoints.get(3);

        double firstVectorCoordinateX = secondDot.getCoordinateX() - firstDot.getCoordinateX();
        double firstVectorCoordinateY = secondDot.getCoordinateY() - firstDot.getCoordinateY();
        double firstVectorCoordinateZ = secondDot.getCoordinateZ() - firstDot.getCoordinateZ();

        double secondVectorCoordinateX = thirdDot.getCoordinateX() - firstDot.getCoordinateX();
        double secondVectorCoordinateY = thirdDot.getCoordinateY() - firstDot.getCoordinateY();
        double secondVectorCoordinateZ = thirdDot.getCoordinateZ() - firstDot.getCoordinateZ();

        double thirdVectorCoordinateX = thirdDot.getCoordinateX() - secondDot.getCoordinateX();
        double thirdVectorCoordinateY = thirdDot.getCoordinateY() - secondDot.getCoordinateY();
        double thirdVectorCoordinateZ = thirdDot.getCoordinateZ() - secondDot.getCoordinateZ();

        double fourthVectorCoordinateX = fourthDot.getCoordinateX() - firstDot.getCoordinateX();
        double fourthVectorCoordinateY = fourthDot.getCoordinateY() - firstDot.getCoordinateY();
        double fourthVectorCoordinateZ = fourthDot.getCoordinateZ() - firstDot.getCoordinateZ();

        double fifthVectorCoordinateX = fourthDot.getCoordinateX() - secondDot.getCoordinateX();
        double fifthVectorCoordinateY = fourthDot.getCoordinateY() - secondDot.getCoordinateY();
        double fifthVectorCoordinateZ = fourthDot.getCoordinateZ() - secondDot.getCoordinateZ();

        double sixthVectorCoordinateX = fourthDot.getCoordinateX() - thirdDot.getCoordinateX();
        double sixthVectorCoordinateY = fourthDot.getCoordinateY() - thirdDot.getCoordinateY();
        double sixthVectorCoordinateZ = fourthDot.getCoordinateZ() - thirdDot.getCoordinateZ();


        double firstSecRib = Math.sqrt(Math.pow(firstVectorCoordinateX, 2) + Math.pow(firstVectorCoordinateY, 2) +
                Math.pow(firstVectorCoordinateZ, 2));
        double firstThirdRib = Math.sqrt(Math.pow(secondVectorCoordinateX, 2) + Math.pow(secondVectorCoordinateY, 2) +
                Math.pow(secondVectorCoordinateZ, 2));
        double firstFourthRib = Math.sqrt(Math.pow(fourthVectorCoordinateX, 2) + Math.pow(fourthVectorCoordinateY, 2) +
                Math.pow(fourthVectorCoordinateZ, 2));
        double secThirdRib = Math.sqrt(Math.pow(thirdVectorCoordinateX, 2) + Math.pow(thirdVectorCoordinateY, 2) +
                Math.pow(thirdVectorCoordinateZ, 2));
        double secFourthRib = Math.sqrt(Math.pow(fifthVectorCoordinateX, 2) + Math.pow(fifthVectorCoordinateY, 2) +
                Math.pow(fifthVectorCoordinateZ, 2));
        double thirdFourthRib = Math.sqrt(Math.pow(sixthVectorCoordinateX, 2) + Math.pow(sixthVectorCoordinateY, 2) +
                Math.pow(sixthVectorCoordinateZ, 2));

        Tetrahedron tetrahedron = Tetrahedron.getInstance();

        tetrahedron.setFirstEdge(firstSecRib);
        tetrahedron.setSecondEdge(firstThirdRib);
        tetrahedron.setThirdEdge(firstFourthRib);
        tetrahedron.setFourthEdge(secThirdRib);
        tetrahedron.setFifthEdge(secFourthRib);
        tetrahedron.setSixthEdge(thirdFourthRib);

        return tetrahedron;

    }
}
