package by.com.epam.Comparator.EdgeComporator;

import by.com.epam.model.Tetrahedron;

import java.util.Comparator;

public class ThirdEdgeComparator implements Comparator<Tetrahedron> {
    @Override
    public int compare(Tetrahedron firstTetra, Tetrahedron secTetra) {
        return Double.compare(firstTetra.getThirdEdge(),secTetra.getThirdEdge());
    }
}
