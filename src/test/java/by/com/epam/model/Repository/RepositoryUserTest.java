package by.com.epam.model.Repository;

import by.com.epam.data.TetrahedronCreator;
import by.com.epam.data.TetrahedronException;
import by.com.epam.logic.TetrahedronLogic;
import by.com.epam.model.Tetrahedron;
import by.com.epam.model.TetrahedronType;
import by.com.epam.view.DataReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryUserTest {
    @Mock
    TetrahedronCreator tetrahedronCreator = new TetrahedronCreator();
    private final String FILE_NAME = "File.txt";
    private final String SEC_FILE_NAME = "SecondFile.txt";
    DataReader dataReader = new DataReader();
    TetrahedronLogic tetrahedronLogic = new TetrahedronLogic();
    Tetrahedron tetrahedron = tetrahedronCreator.createTetrahedron( dataReader.GetFromFile(FILE_NAME));
    Tetrahedron secTetra = tetrahedronCreator.createTetrahedron(dataReader.GetFromFile(SEC_FILE_NAME));
    RepositoryUser repositoryUser = new RepositoryUser();
    List<Tetrahedron> tetrahedronList = new ArrayList<>();
    RepositoryUserTest() throws TetrahedronException {
    }


    @Test
    void shouldFindFigureWithParam() throws TetrahedronException {
        //before
        tetrahedronList.add(tetrahedron);
        tetrahedronList.add(secTetra);
        List<Tetrahedron> tt = repositoryUser.findFigure(TetrahedronType.SecondEdgeLength,4.0);
        //test
        Assertions.assertEquals(tetrahedronList.get(0),tt.get(0));
    }

    @Test
    void sortBook() {

    }
}