package com.brainacad.javacourse.basics.oop.lab_2_4_6;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class MyPyramid {

    public static void printPyramid(int height) {
        if (height < 1 || height > 9) {
            System.out.println("Height should be between 1 and 9");
            return;
        }
        for (int i = 1; i <= height; i++) {
            int leftInternalCounter = 1;
            int rightInternalCounter = i;
            for (int j = height; j > 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(leftInternalCounter++);
                }
            }
            System.out.print(i);
            for (int k = 1; k < height; k++) {
                if (k < i) {
                    System.out.print(--rightInternalCounter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(9);
    }

}
