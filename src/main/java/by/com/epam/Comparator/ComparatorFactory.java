package by.com.epam.Comparator;

import by.com.epam.Comparator.EdgeComporator.*;
import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;
import by.com.epam.model.TetrahedronType;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Tetrahedron> createSpec(TetrahedronType type) throws TetrahedronException {
        switch (type){
            case ID ->{
                return new IdComparator();
            }
            case FirstEdgeLength -> {
                return new FirstEdgeComparator();
            }
            case SecondEdgeLength -> {
                return new SecondEdgeComparator();
            }
            case ThirdEdgeLength -> {
                return new ThirdEdgeComparator();
            }
            case FourthEdgeLength -> {
                return new FourthEdgeComparator();
            }
            case FifthEdgeLength -> {
                return new FifthEdgeComparator();
            }
            case SixthEdgeLength -> {
                return new SixthEdgeComparator();
            }
            default -> throw new TetrahedronException("There is no such type") ;
        }
    }
}
