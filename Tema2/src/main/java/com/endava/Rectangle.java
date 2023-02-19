package com.endava;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.width = rectangleWidth;
        this.height = rectangleHeight;
    }

    public double computeArea() {
        return this.width * this.height;
    }

    public double computePerimeter() {
        return 2 * (this.width + this.height);

    }
}
