package com;

public class Rectangle implements Calculator {

    public double a;
    public double b;

    Rectangle() {
        this.a = 1;
        this.b = 1;
    }

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
