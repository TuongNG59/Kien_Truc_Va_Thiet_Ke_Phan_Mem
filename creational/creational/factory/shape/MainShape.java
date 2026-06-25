package creational.factory.shape;

import creational.factory.shape.shapes.Rectangle;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new ShapeFactory().createShape(ShapeType.RECTANGLE, "but muc","A4","bia");
        System.out.println(shape.draw());
    }
}
