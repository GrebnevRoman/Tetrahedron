package by.com.epam.Observer;

import by.com.epam.Observer.Observer;
import by.com.epam.logic.TetrahedronLogic;
import by.com.epam.model.Tetrahedron;
import by.com.epam.model.TetrahedronParameters;

import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

public class ConditionDisplay implements Observer {
    private Map<Integer, TetrahedronParameters> map = new HashMap<>();
    private final Tetrahedron tetrahedron = Tetrahedron.getInstance();
    private final TetrahedronLogic tetrahedronLogic = new TetrahedronLogic();


    @Override
    public void update(TetrahedronObservable tetrahedronObservable) {
        double square = tetrahedronLogic.calculateSquare(tetrahedron);
        double volume = tetrahedronLogic.calculateValue(tetrahedron);
        map.put(tetrahedronObservable.getId(),new TetrahedronParameters(square,volume));
    }
}
