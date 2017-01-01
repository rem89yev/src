package com.brainacad.javacourse.basics.oop.lab_2_7.testshapes;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape("red");
        System.out.println(shape);
        System.out.println(shape.calcArea());

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
            System.out.println(s);
            System.out.println(s.calcArea());
        }

        double sumArea = 0.0;
        for (Shape s : shapes) {
            sumArea += s.calcArea();
        }
        System.out.println("Sum area: " + sumArea);

        double sumCircleArea = 0.0;
        double sumRectArea = 0.0;
        double sumTriangleArea = 0.0;
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                sumCircleArea += s.calcArea();
            } else if (s instanceof Rectangle) {
                sumRectArea += s.calcArea();
            } else if (s instanceof Triangle) {
                sumTriangleArea += s.calcArea();
            }
        }
        System.out.println("Sum circle area: " + sumCircleArea);
        System.out.println("Sum rect area: " + sumRectArea);
        System.out.println("Sum triangle area: " + sumTriangleArea);

    }

}
