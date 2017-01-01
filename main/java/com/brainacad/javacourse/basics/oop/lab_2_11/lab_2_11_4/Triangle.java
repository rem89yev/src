package com.brainacad.javacourse.basics.oop.lab_2_11.lab_2_11_4;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public class Triangle extends Shape implements Comparable { // should use Comparable<Triangle>, will be discussed in "Generics" topic

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

    @Override
    public void draw() {
        System.out.println(this);
        System.out.println("Area=" + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle that = (Triangle) o; // dangerous(!!!), should be handled with some exception, stay tuned :)
        if (this.calcArea() > that.calcArea()) {
            return 1;
        }
        if (this.calcArea() < that.calcArea()) {
            return -1;
        }
        return 0;
    }

}
