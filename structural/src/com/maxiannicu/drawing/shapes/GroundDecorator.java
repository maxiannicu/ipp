package com.maxiannicu.drawing.shapes;

import com.maxiannicu.drawing.api.DrawingApi;

public class GroundDecorator implements Shape {
    private final Shape shape;
    private final int positionY;
    private final int screenWidth;
    private final int screenHeight;

    public GroundDecorator(Shape shape, int positionY, int screenWidth, int screenHeight) {
        this.shape = shape;
        this.positionY = positionY;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    @Override
    public void paint(DrawingApi api) {
        api.fillRect(0, positionY, screenWidth, screenHeight);
        shape.paint(api);
    }
}
