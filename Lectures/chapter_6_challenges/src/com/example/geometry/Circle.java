package com.example.geometry;

public class Circle {
    private int radius;

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
