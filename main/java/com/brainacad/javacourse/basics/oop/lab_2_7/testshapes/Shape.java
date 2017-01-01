package com.brainacad.javacourse.basics.oop.lab_2_7.testshapes;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public class Shape {

    protected String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
