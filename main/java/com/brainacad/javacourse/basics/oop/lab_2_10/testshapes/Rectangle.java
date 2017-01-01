package com.brainacad.javacourse.basics.oop.lab_2_10.testshapes;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public class Rectangle extends Shape implements Comparable { // should use Comparable<Rectangle>, will be discussed in "Generics" topic

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + shapeColor +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
        System.out.println("Area=" + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle that = (Rectangle) o; // dangerous(!!!), should be handled with some exception, stay tuned :)
        if (this.calcArea() > that.calcArea()) {
            return 1;
        }
        if (this.calcArea() < that.calcArea()) {
            return -1;
        }
        return 0;
    }

}
