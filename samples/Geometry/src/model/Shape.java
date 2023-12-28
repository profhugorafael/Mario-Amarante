package model;

import model.enums.Color;

public class Shape {

    private double thickness; // espessura
    private Color color;

    // no args constructor
    public Shape() {}

    // all args constructor
    public Shape(double thickness, Color color) {
        this.thickness = thickness;
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return -1;
    }

    public double getPerimeter() {
        return -1;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "thickness=" + thickness +
                ", color=" + color +
                '}';
    }
}
