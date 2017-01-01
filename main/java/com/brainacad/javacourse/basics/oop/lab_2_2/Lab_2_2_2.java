package com.brainacad.javacourse.basics.oop.lab_2_2;

import com.brainacad.javacourse.basics.oop.lab_2_2_1.SquareMatrix;

/**
 * @author Dmitry Adonin
 * @since 12/08/16.
 */
public class Lab_2_2_2 {

    public static void main(String[] args) {

        SquareMatrix squareMatrix1 = new SquareMatrix();
        SquareMatrix squareMatrix2 = new SquareMatrix();

        System.out.println("Create first matrix:\n");
        squareMatrix1.fill();
        System.out.println("\n" + squareMatrix1);

        System.out.println("Create second matrix:\n");
        squareMatrix2.fill();
        System.out.println("\n" + squareMatrix2);

        SquareMatrix addResultMatrix = squareMatrix1.add(squareMatrix2);
        System.out.println("Result of addition:\n" + addResultMatrix);

        SquareMatrix multiplyResultMatrix = squareMatrix1.multiply(squareMatrix2);
        System.out.println("Result of multiplying:\n" + multiplyResultMatrix);

    }

}
