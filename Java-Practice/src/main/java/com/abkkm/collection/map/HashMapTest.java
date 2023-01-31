package com.abkkm.collection.map;
import org.junit.Test;

import com.abkkm.generics.Fruit;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapTest {
    @Test
    public void test() throws Exception {
        Map<String, Fruit> map = new HashMap<>();
        Object[] objec = getArrayListCapaCity(map);
        map.put("banana", new Fruit("banana", "19"));
        map.put("apple", new Fruit("apple", "19"));
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }

    }

    public Object[] getArrayListCapaCity(Map<String, Fruit> map) throws Exception {

        Class c = Class.forName("java.util.HashMap");
        Field field = c.getDeclaredField("table");
        field.setAccessible(true);
        Object[] object = (Object[]) field.get(map);
        return object;
    }
}
