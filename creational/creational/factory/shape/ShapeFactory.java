package creational.factory.shape;
import creational.factory.shape.shapes.Circle;
import creational.factory.shape.shapes.Rectangle;
import creational.factory.shape.shapes.Triangle;

import java.awt.*;

public class ShapeFactory {
        public Shape createShape(ShapeType shapeType,String brush, String paper, String frame) {

            switch (shapeType){
                case RECTANGLE -> {
                    return new Rectangle(brush, paper, frame);
                }
                case TRIANGLE -> {
                    return new Triangle(brush, paper, frame);
                }
                case CIRCLE -> {
                    return new Circle(brush, paper, frame);
                }
            }
            return null;
        }



}
