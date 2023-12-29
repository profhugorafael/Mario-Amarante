package model;

import model.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;
    private double thickness;

    public AbstractShape() {
    }

    public AbstractShape(Color color, double thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

//    public abstract double getArea();
//
//    public abstract double getPerimeter();
}
