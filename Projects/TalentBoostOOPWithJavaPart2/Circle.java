package com.company;

public class Circle implements Shape{
    private double R;
    public Circle()
    {
        R = 1;
    }
    public Circle(double R)
    {
        this.R = R;
    }

    @Override
    public double getArea() {
        return R*R*Math.PI;
    }
}
