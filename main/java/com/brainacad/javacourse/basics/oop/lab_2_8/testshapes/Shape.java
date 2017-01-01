package com.brainacad.javacourse.basics.oop.lab_2_8.testshapes;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public abstract class Shape implements Drawable {

    protected String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
