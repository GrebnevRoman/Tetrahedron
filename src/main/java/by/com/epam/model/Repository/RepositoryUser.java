package by.com.epam.model.Repository;

import by.com.epam.Comparator.ComparatorFactory;
import by.com.epam.Specification.Specification;
import by.com.epam.Specification.SpecificationFactory;
import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;
import by.com.epam.model.TetrahedronType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepositoryUser implements TetrahedronRepository {

    private final List<Tetrahedron> tetrahedronList = new ArrayList<>();

    @Override
    public void addFigure(Tetrahedron tetrahedron) {
        tetrahedronList.add(tetrahedron);
    }

    @Override
    public void removeFigure(Tetrahedron tetrahedron) {
        tetrahedronList.remove(tetrahedron);
    }

    @Override
    public List<Tetrahedron> findFigure(TetrahedronType parameter, double value) throws TetrahedronException {
        SpecificationFactory specificationFactory = new SpecificationFactory();
        Specification specification =specificationFactory.createSpec(parameter);
        return specification.find(tetrahedronList,value);
    }

    @Override
    public void sortBook(TetrahedronType parameter) throws TetrahedronException {
        ComparatorFactory comparatorFactory = new ComparatorFactory();
        Comparator<Tetrahedron> comparator = comparatorFactory.createSpec(parameter);
        tetrahedronList.sort(comparator);
    }
}
