package org.example.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class MainReflect {
    public static void main(String[] args) throws Exception {
        System.out.println(TestExpo.numberOfInstances);
        TestExpo testExpo0 = new TestExpo(1);
        System.out.println(TestExpo.numberOfInstances);
        TestExpo testExpo1 = new TestExpo(1);
        System.out.println(TestExpo.numberOfInstances);

        testExpo0.setSomeMap(Map.of(1, "one", 2, "two"));
        System.out.println(testExpo0.getSomeMap());

        Method someAct = testExpo0.getClass().getDeclaredMethod("someActions");
        someAct.setAccessible(true);

        Method someActList = testExpo0.getClass().getDeclaredMethod("someActionsList", List.class);
        someActList.setAccessible(true);

        System.out.println(someAct.invoke(testExpo0));
        System.out.println(someAct.invoke(testExpo1));

        System.out.println(someActList.invoke(testExpo1, List.of(1, 2, 4, "dfs")));
    }
}
