package model;

import model.enums.Color;

public class Circle extends AbstractShape {

    public static final double PI = 3.1415;

    private double radius;

    public Circle() {
    }

    public Circle(Color color, double thickness, double radius) {
        super(color, thickness);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*PI*radius;
    }
}
