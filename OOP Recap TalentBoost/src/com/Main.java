package com;

public class Main {

    public static void main(String[] args) {
	    Calculator s = new Square(5);
	    Calculator r = new Rectangle(5,10);
	    Calculator c = new Circle(5);
        System.out.println(s.getArea());
        System.out.println(r.getArea());
        System.out.println(c.getArea());
        System.out.println(c.getArea());
        System.out.println("Done");
    }
}
