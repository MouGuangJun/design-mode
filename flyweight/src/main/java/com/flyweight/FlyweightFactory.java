package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    public static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String key) {
        Shape shape = shapes.get(key);
        if (shape == null) {
            shape = new Circle(key);
            shapes.put(key, shape);
        }

        return shape;
    }

    public static int getSum() {
        return shapes.size();
    }
}
