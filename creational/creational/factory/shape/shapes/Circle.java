package creational.factory.shape.shapes;

import creational.factory.shape.Shape;

public class Circle extends Shape {
    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return super.draw() + " Circle";
    }
}
