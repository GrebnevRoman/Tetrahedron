package by.com.epam.Observer;

import by.com.epam.data.TetrahedronCreator;
import by.com.epam.data.TetrahedronException;
import by.com.epam.model.Tetrahedron;
import by.com.epam.view.DataReader;

import java.util.List;

public class TetrahedronObservable implements Observable {

    private List<Observer> observers;
    Tetrahedron tetrahedron = Tetrahedron.getInstance();
    TetrahedronCreator tetrahedronCreator = new TetrahedronCreator();
    DataReader dataReader = new DataReader();

    public void setTetrahedronSites() throws TetrahedronException {
        tetrahedron = tetrahedronCreator.createTetrahedron(dataReader.GetFromFile("file.txt"));
        notifyObservers();
    }


    @Override
    public void addObserver(Observer tetrahedronObserver) {
        observers.add(tetrahedronObserver);

    }

    public int  getId(){
       return tetrahedron.getId();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        };
    }
}
