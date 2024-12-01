package org.example.reflection;

import java.util.Map;

public class Ancestor {
    private Map someMap;

    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }

    public Map getSomeMap() {
        return someMap;
    }
}
