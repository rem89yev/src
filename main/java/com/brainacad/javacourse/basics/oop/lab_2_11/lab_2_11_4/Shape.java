package com.brainacad.javacourse.basics.oop.lab_2_11.lab_2_11_4;

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
    public static Shape parseShape(String params) throws InvalidShapeStringException {
        String type, color, values;
        Shape result = null;
        StringTokenizer paramsTokenizer = new StringTokenizer(params, ":");
        if (paramsTokenizer.countTokens() != 3) {
            throw new InvalidShapeStringException();
        } else {
            type = paramsTokenizer.nextElement().toString();
            color = paramsTokenizer.nextElement().toString();
            values = paramsTokenizer.nextElement().toString();
        }
        switch (type) {
            case "triangle":
                StringTokenizer triangleSides = new StringTokenizer(values, ",");
                if (triangleSides.countTokens() != 3) {
                    throw new InvalidShapeStringException();
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
                    throw new InvalidShapeStringException();
                } else {
                    double a = Double.parseDouble(rectangleSides[0]);
                    double b = Double.parseDouble(rectangleSides[1]);
                    result = new Rectangle(color, a, b);
                }
                break;
            default:
                throw new InvalidShapeStringException();
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
