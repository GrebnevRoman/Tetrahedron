package by.com.epam.Specification;

import by.com.epam.Comparator.EdgeComporator.FifthEdgeComparator;
import by.com.epam.Specification.EdgeSpecification.*;
import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;
import by.com.epam.model.TetrahedronType;

public class SpecificationFactory {
    public Specification createSpec(TetrahedronType type) throws TetrahedronException {
        switch (type){
            case ID -> {
                return new IdSpecification();
            }
            case FirstEdgeLength -> {
                return new FirstEdgeSpecification();
            }
            case SecondEdgeLength -> {
                return new SecondEdgeSpecification();
            }
            case ThirdEdgeLength -> {
                return new ThirdEdgeSpecification();
            }
            case FourthEdgeLength -> {
                return new FourthEdgeSpecification();
            }
            case FifthEdgeLength -> {
                return new FifthEdgeSpecification();
            }
            case SixthEdgeLength -> {
                return new SixthEdgeSpecification();
            }
            default -> throw new TetrahedronException("Invalid type");
        }
    }
}
