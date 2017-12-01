package com.maxiannicu.drawing.api;


import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SwingDrawingApi extends JComponent implements DrawingApi {
    private ArrayList<Consumer<Graphics>> drawings = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        drawings.forEach(c -> c.accept(graphics));
    }

    @Override
    public void drawLine(int fromX, int fromY, int toX, int toY) {
        drawings.add(graphics -> {
            graphics.drawLine(fromX, fromY, toX, toY);
        });
    }

    @Override
    public void drawRect(int fromX, int fromY, int width, int height) {
        drawings.add(graphics -> {
            graphics.drawRect(fromX, fromY, width, height);
        });
    }

    @Override
    public void fillRect(int fromX, int fromY, int width, int height) {
        drawings.add(graphics -> {
            graphics.fillRect(fromX, fromY, width, height);
        });
    }

    @Override
    public void drawCircle(int centerX, int centerY, int radius) {
        drawings.add(graphics -> {
            int diameter = radius * 2;
            graphics.drawOval(centerX - radius, centerY - radius, diameter, diameter);
        });
    }
}
