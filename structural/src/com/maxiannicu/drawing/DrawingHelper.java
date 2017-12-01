package com.maxiannicu.drawing;

import com.maxiannicu.drawing.api.DrawingApi;
import com.maxiannicu.drawing.shapes.*;

public class DrawingHelper {
    public static void drawHouseOnWheels(DrawingApi api){
        CompositeShape compositeShape = new CompositeShape();

        compositeShape.addShape(new HouseShape(30,30,200,300));
        compositeShape.addShape(new WheelShape(100,230,25,65));
        compositeShape.addShape(new WheelShape(250,230,25,65));

        compositeShape.paint(api);
    }

    public static void drawTerrain(DrawingApi api){
        TreeShape shape = new TreeShape(400,160, 50, 100);
        GroundDecorator groundDecorator = new GroundDecorator(shape, 260, 500, 500);

        groundDecorator.paint(api);
    }
}
