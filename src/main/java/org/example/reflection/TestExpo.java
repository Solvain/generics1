package org.example.reflection;

import java.util.List;
import java.util.Map;

public class TestExpo extends Ancestor{
    public static int numberOfInstances = 0;
    private int some;

    public TestExpo(int some) {
        numberOfInstances++;
        this.some = some;
    }

    public int getSome() {
        return some;
    }

    public void setSome(int some) {
        this.some = some;
    }

    private String someActions () {
        if (getSomeMap() == null) {
            return "null";
        }
        return getSomeMap().size() % 2 == 0 ? getSomeMap().keySet().toString() : getSomeMap().values().toString();
    }

    private String someActionsList (List list) {
        return list.toString();
    }

}
