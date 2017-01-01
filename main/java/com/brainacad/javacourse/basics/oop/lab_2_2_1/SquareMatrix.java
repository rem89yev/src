package com.brainacad.javacourse.basics.oop.lab_2_2_1;

import java.util.Scanner;

/**
 * @author Dmitry Adonin
 * @since 12/08/16.
 */
public class SquareMatrix {

    public static final int DEFAULT_SIZE = 2;

    private int[][] values;

    public static void main(String[] args) {
        SquareMatrix squareMatrix = new SquareMatrix();
        squareMatrix.fill();
        System.out.println(squareMatrix);
    }

    public SquareMatrix() {
        values = new int[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public SquareMatrix(int size) {
        values = new int[size][size];
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.println("Input value of element with index [" + i + "," + j + "]");
                values[i][j] = scanner.nextInt();
            }
        }
    }

    public SquareMatrix add(SquareMatrix that) {
        if (checkDimension(that)) return this;
        SquareMatrix result = new SquareMatrix(this.values.length);
        for (int i = 0; i < result.values.length; i++) {
            for (int j = 0; j < result.values[i].length; j++) {
                result.values[i][j] = this.values[i][j] + that.values[i][j];
            }
        }
        return result;
    }

    public SquareMatrix multiply(SquareMatrix that) {
        if (checkDimension(that)) return this;
        SquareMatrix result = new SquareMatrix(this.values.length);
        for (int i = 0; i < result.values.length; i++) {
            for (int j = 0; j < result.values[i].length; j++) {
                result.values[i][j] = this.values[i][j] * that.values[i][j];
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                result += values[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    private boolean checkDimension(SquareMatrix that) {
        if (this.values.length != that.values.length) {
            System.out.println("Matrices have different dimension");
            return true;
        }
        return false;
    }
}
