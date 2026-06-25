package creational.factory.shape;

public abstract class Shape {
     private String brush;
     private String paper;
     private String frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "brush='" + brush + '\'' +
                ", paper='" + paper + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }

    public String draw() {
        return toString();
    }
}
