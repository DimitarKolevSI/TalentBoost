package com.company;

public class Rectangle implements Shape {
    private double A;
    private double B;
    public Rectangle()
    {
        A = 1;
        B = 1;
    }
    public Rectangle(double A, double B)
    {
        this.A = A;
        this.B = B;
    }

    @Override
    public double getArea() {
        return A*B;
    }
}
