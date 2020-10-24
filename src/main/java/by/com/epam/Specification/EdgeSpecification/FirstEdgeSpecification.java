package by.com.epam.Specification.EdgeSpecification;

import by.com.epam.Specification.Specification;
import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;

import java.util.List;

public class FirstEdgeSpecification extends Specification<Double> {


    @Override
    public boolean specified(Tetrahedron tetrahedron, Double value) {
        return tetrahedron.getFirstEdge() == value;
    }
}
