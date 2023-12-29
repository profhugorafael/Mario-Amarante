package model;

import model.enums.Color;

public class Rectangle extends AbstractShape {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(Color color, double thickness, double width, double height) {
        super(color, thickness);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }


    public double getPerimeter() {
        return 2*(width+height);
    }
}
