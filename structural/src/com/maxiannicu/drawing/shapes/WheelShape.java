package com.maxiannicu.drawing.shapes;

import com.maxiannicu.drawing.api.DrawingApi;

public class WheelShape implements Shape {
    private final int positionX;
    private final int positionY;
    private final int radius;
    private final int tireRation;

    public WheelShape(int positionX, int positionY, int radius, int tireRation) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.radius = radius;
        this.tireRation = tireRation;
    }

    @Override
    public void paint(DrawingApi api) {
        api.drawCircle(positionX,positionY, radius);
        api.drawCircle(positionX,positionY, radius * tireRation / 100);
    }
}
