package com.maxiannicu.drawing.api;

public interface DrawingApi {
    void drawLine(int fromX,int fromY,int toX,int toY);
    void drawCircle(int centerX,int centerY, int radius);
    void drawRect(int fromX,int fromY,int width,int height);
    void fillRect(int fromX,int fromY,int width,int height);
}
