package com.maxiannicu.drawing.shapes;

import com.maxiannicu.drawing.api.DrawingApi;

public class TreeShape implements Shape {
    private final int positionX;
    private final int positionY;
    private final int width;
    private final int height;

    public TreeShape(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(DrawingApi api) {
        int rootWidth = width * 2 / 10;
        int rootHeight = this.height * 5 / 10;
        api.fillRect(positionX + width / 2 - rootWidth / 2, positionY + this.height / 2, rootWidth, rootHeight);
        api.drawCircle(positionX + width / 2, positionY + height / 4, height / 4);
        api.drawLine(positionX + width / 2, positionY + height / 2, positionX + width / 2, positionY);
        api.drawLine(positionX + width / 2, positionY + height / 2, positionX, positionY);
        api.drawLine(positionX + width / 2, positionY + height / 2, positionX + width, positionY);
    }
}
