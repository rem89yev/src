package com.brainacad.javacourse.basics.oop.lab_2_2_5;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class A {

    public void calculateSquare(int side) {
        System.out.println("Foursquare square = " + side * side);
    }

    public void calculateSquare(int length, int height) {
        System.out.println("Rectangle square = " + length * height);
    }

    public void calculateSquare(double radius) {
        System.out.println("Circle square = " + Math.PI * Math.pow(radius, 2));
    }

}
