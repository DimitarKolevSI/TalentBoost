package com;

public class Square implements Calculator {
    public double side;

    Square(){
        side = 0;
    }

    Square(int side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }
}
