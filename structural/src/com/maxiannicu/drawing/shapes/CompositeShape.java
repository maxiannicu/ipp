package com.maxiannicu.drawing.shapes;

import com.maxiannicu.drawing.api.DrawingApi;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    public Shape getComponent(int index){
        return shapes.get(index);
    }

    @Override
    public void paint(DrawingApi api) {
        shapes.forEach(shape -> shape.paint(api));
    }
}
