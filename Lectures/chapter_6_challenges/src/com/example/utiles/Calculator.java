package com.example.utiles;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Circle cir = new Circle(6);
        System.out.println(cir.getArea());
        cir.setRadius(10);
        System.out.println(cir.getArea());

        Rectangle rec = new Rectangle(6,10);
        System.out.println(rec.getArea());
        rec.setLength(15);
        System.out.println(rec.getArea());
    }
}
