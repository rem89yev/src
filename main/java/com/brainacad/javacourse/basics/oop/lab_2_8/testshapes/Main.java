package com.brainacad.javacourse.basics.oop.lab_2_8.testshapes;

import java.util.Arrays;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public class Main {

    public static void main(String[] args) {

        /*Shape shape = new Shape("red");
        System.out.println(shape);
        System.out.println(shape.calcArea());*/

        Circle circle = new Circle("green", 10);
        System.out.println(circle);
        System.out.println(circle.calcArea());

        Rectangle rectangle = new Rectangle("black", 15, 16);
        System.out.println(rectangle);
        System.out.println(rectangle.calcArea());

        Triangle triangle1 = new Triangle("white", 5, 6, 7);
        System.out.println(triangle1);
        System.out.println(triangle1.calcArea());
        Triangle triangle2 = new Triangle("yellow", 7, 8, 9);
        System.out.println(triangle2);
        System.out.println(triangle2.calcArea());

        Shape[] shapes = new Shape[] {circle, rectangle, triangle1, triangle2};
        for (Shape s : shapes) {
            s.draw();
        }

        if (triangle1.compareTo(triangle2) > 0) {
            System.out.println("Triangle1 area bigger than Triangle2 area");
        } else if (triangle1.compareTo(triangle2) < 0){
            System.out.println("Triangle1 area less than Triangle2 area");
        } else {
            System.out.println("Triangle1 area equals Triangle2 area");
        }

        Shape[] triangles = {triangle2, triangle1};
        for (Shape s : triangles) {
            s.draw();
        }
        Arrays.sort(triangles);
        for (Shape s : triangles) {
            s.draw();
        }

    }

}
