package com.maxiannicu.drawing.shapes;

import com.maxiannicu.drawing.api.DrawingApi;

public class HouseShape implements Shape {
    private final int positionX;
    private final int positionY;
    private final int height;
    private final int width;

    public HouseShape(int positionX, int positionY, int height, int width) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
    }

    @Override
    public void paint(DrawingApi api) {
        api.drawRect(positionX, positionY, width, height);

        int windowHeight = height * 25 / 100;
        int windowWidth = width * 15 / 100;

        api.drawRect(positionX + (15 * width/100), positionY + (25 * height/100), windowWidth, windowHeight);
        api.drawRect(positionX + (70 * width/100), positionY + (25 * height/100), windowWidth, windowHeight);
    }
}
