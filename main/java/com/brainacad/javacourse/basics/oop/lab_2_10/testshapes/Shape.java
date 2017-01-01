package com.brainacad.javacourse.basics.oop.lab_2_10.testshapes;

import java.util.StringTokenizer;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public abstract class Shape implements Drawable {

    protected String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    /**
    * Shape params format should be like “rectangle:RED:10,20”; “triangle:GREEN:9,7,12”; “circle:BLACK:10”
    */
    public static Shape parseShape(String params) {
        String type, color, values;
        Shape result = null;
        StringTokenizer paramsTokenizer = new StringTokenizer(params, ":");
        if (paramsTokenizer.countTokens() != 3) {
            return null; // bad practice to return null, exception should be used, will be discussed later
        } else {
            type = paramsTokenizer.nextElement().toString();
            color = paramsTokenizer.nextElement().toString();
            values = paramsTokenizer.nextElement().toString();
        }
        switch (type) {
            case "triangle":
                StringTokenizer triangleSides = new StringTokenizer(values, ",");
                if (triangleSides.countTokens() != 3) {
                    return null; // look previous comment
                } else {
                    double a = Double.parseDouble(triangleSides.nextElement().toString());
                    double b = Double.parseDouble(triangleSides.nextElement().toString());
                    double c = Double.parseDouble(triangleSides.nextElement().toString());
                    result = new Triangle(color, a, b, c);
                }
                break;
            case "circle":
                result = new Circle(color, Double.parseDouble(values));
                break;
            case "rectangle":
                String[] rectangleSides = values.split(",");
                if (rectangleSides.length != 2) {
                    return null; // look previous comment
                } else {
                    double a = Double.parseDouble(rectangleSides[0]);
                    double b = Double.parseDouble(rectangleSides[1]);
                    result = new Rectangle(color, a, b);
                }
                break;
            default:
                return null; // look previous comment
        }
        return result;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
