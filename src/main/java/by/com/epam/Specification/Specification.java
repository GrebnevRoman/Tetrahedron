package by.com.epam.Specification;

import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

public abstract class Specification<T> {
    public abstract boolean specified(Tetrahedron tetrahedron, T value);

    public List<Tetrahedron> find(List<Tetrahedron> tetras, T value) throws TetrahedronException {
        List<Tetrahedron> result = new ArrayList<>();
        for (Tetrahedron tetrahedron : tetras) {
            if (specified(tetrahedron, value)) {
                result.add(tetrahedron);
            }
        }
        if (result.size() > 0) {
            return result;
        } else throw new TetrahedronException("Tetrahedron does not exist");
    }
}
