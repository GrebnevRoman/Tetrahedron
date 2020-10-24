package by.com.epam.model.Repository;

import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;
import by.com.epam.model.TetrahedronType;

import java.util.List;

public interface TetrahedronRepository {
    void addFigure(Tetrahedron tetrahedron);
    void removeFigure(Tetrahedron tetrahedron);
    List<Tetrahedron> findFigure(TetrahedronType parameter , double value) throws TetrahedronException;
    void sortBook(TetrahedronType parameter) throws TetrahedronException;
}
