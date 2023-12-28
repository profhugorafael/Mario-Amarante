package model;

import model.enums.Color;

public class Circle extends Shape {

    public static final double PI = 3.14159265;
    private double radius;

    public Circle() {
    }

    public Circle(double thickness, Color color, double radius) {
        super(thickness, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
