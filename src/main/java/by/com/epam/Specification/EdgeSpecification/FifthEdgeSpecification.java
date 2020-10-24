package by.com.epam.Specification.EdgeSpecification;

import by.com.epam.Specification.Specification;
import by.com.epam.model.Tetrahedron;

public class FifthEdgeSpecification extends Specification<Double> {
    @Override
    public boolean specified(Tetrahedron tetrahedron, Double value) {
        return tetrahedron.getFifthEdge() == value;
    }
}
