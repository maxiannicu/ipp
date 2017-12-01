package com.maxiannicu;

import com.maxiannicu.drawing.DrawingHelper;
import com.maxiannicu.drawing.api.DrawingApi;
import com.maxiannicu.drawing.api.SwingDrawingApi;
import com.maxiannicu.drawing.shapes.WheelShape;
import com.maxiannicu.drawing.shapes.HouseShape;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingDrawingApi component = new SwingDrawingApi();
        DrawingHelper.drawTerrain(component);
        DrawingHelper.drawHouseOnWheels(component);

        JFrame mainFrame = new JFrame("Structural");
        mainFrame.getContentPane().add(component);
        mainFrame.pack();
        mainFrame.setSize(500,500);
        mainFrame.setVisible(true);
    }
}
