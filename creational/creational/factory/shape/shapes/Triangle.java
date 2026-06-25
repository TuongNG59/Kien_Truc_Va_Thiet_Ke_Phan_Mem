package creational.factory.shape.shapes;

import creational.factory.shape.Shape;

public class Triangle extends Shape {
    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return super.draw() + " Triangle";
    }
}
