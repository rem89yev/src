package com.brainacad.javacourse.basics.oop.lab_2_7.testshapes;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = calcS();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private double calcS() {
        return (a + b + c) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + shapeColor +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

}
