package com.company;

public class Square implements Shape {
    private double A;
    public Square()
    {
        A = 1;
    }
    public Square(int A)
    {
        this.A = A;
    }

    @Override
    public double getArea() {
        return A*A;
    }
}
