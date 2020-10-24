package by.com.epam.Comparator.EdgeComporator;

import by.com.epam.Observer.TetrahedronObservable;
import by.com.epam.model.Tetrahedron;

import java.util.Comparator;

public class FifthEdgeComparator implements Comparator<Tetrahedron> {


    @Override
    public int compare(Tetrahedron firstTetra, Tetrahedron secondTetra) {
        return Double.compare(firstTetra.getFifthEdge(),secondTetra.getFifthEdge());
    }
}
