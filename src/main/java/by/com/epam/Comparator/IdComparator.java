package by.com.epam.Comparator;

import by.com.epam.model.Tetrahedron;

import java.util.Comparator;

public class IdComparator implements Comparator<Tetrahedron> {
    @Override
    public int compare(Tetrahedron firstTetra, Tetrahedron secTetra) {
        return Integer.compare(firstTetra.getId(),secTetra.getId());
    }
}
