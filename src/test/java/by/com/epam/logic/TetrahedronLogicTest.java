package by.com.epam.logic;

import by.com.epam.data.TetrahedronCreator;
import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;
import by.com.epam.view.DataReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class TetrahedronLogicTest {
    @Mock
    TetrahedronCreator tetrahedronCreator = new TetrahedronCreator();
    private final String FILE_NAME = "File.txt";
    DataReader dataReader = new DataReader();
    TetrahedronLogic tetrahedronLogic = new TetrahedronLogic();
    Tetrahedron tetrahedron = tetrahedronCreator.createTetrahedron( dataReader.GetFromFile(FILE_NAME));
    TetrahedronLogicTest() throws TetrahedronException {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void shouldCalculateSquare() {
        Assertions.assertEquals(328.2427904694178,tetrahedronLogic.calculateSquare(tetrahedron));

    }

    @Test
    void shouldCalculateValue() {
        Assertions.assertEquals(0.5161829426152259,tetrahedronLogic.calculateValue(tetrahedron));
    }
}