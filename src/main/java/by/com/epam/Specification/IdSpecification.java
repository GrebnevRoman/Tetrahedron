package by.com.epam.Specification;

import by.com.epam.model.Tetrahedron;

public class IdSpecification extends Specification<Integer> {
    @Override
    public boolean specified(Tetrahedron tetrahedron, Integer value) {
        return tetrahedron.getId() == value;
    }
}
