package creational.factory.shape.shapes;

import creational.factory.shape.Shape;

public class Rectangle extends Shape {
    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return super.draw() + " Rectangle";
    }
}
