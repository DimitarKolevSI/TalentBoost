package com;

public class Circle implements Calculator{
    public double radius;

    Circle(){
        this.radius = 1;
    }

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*Math.PI;
    }
}
