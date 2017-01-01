package com.brainacad.javacourse.basics.oop.lab_2_11.lab_2_11_4;

import java.util.Scanner;

import static com.brainacad.javacourse.basics.oop.lab_2_11.lab_2_11_4.Shape.parseShape;

/**
 * @author Dmytro_Adonin
 * @since 8/18/16
 */
public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[0];
        try {
            shapes = new Shape[] { parseShape("rectangle:RED:10"), // WRONG TEMPLATE FOR CIRCLE!!!
                                   parseShape("triangle:GREEN:9,7,12"),
                                   parseShape("circle:BLACK:10") };
        } catch (InvalidShapeStringException e) {
            System.out.println(e.getMessage());
        }

        for (Shape shape : shapes) {
            shape.draw();
        }

        ///////////////////////////////////////////////////////////////

        System.out.println("Input amount of shapes:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        Shape[] shapes1 = new Shape[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Input " + (i + 1) + " shape template:");
            Scanner scanner1 = new Scanner(System.in);
            String shapeTemplate = scanner1.nextLine();
            try {
                shapes1[i] = parseShape(shapeTemplate);
            } catch (InvalidShapeStringException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Shape shape : shapes1) {
            shape.draw();
        }

    }

}
