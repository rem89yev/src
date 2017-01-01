package com.brainacad.javacourse.basics.fundamentals.lab_1_6;

import java.util.Scanner;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_6_5 {

    public static void main(String[] args) {

        int[][] arr = /* new int[][] */{
                                        { 1, 1, 1, 3, 4 },
                                        { 2, 1, 3, 1, 2 },
                                        { 2, 2, 3, 4, 1 },
                                        { 3, 3, 3, 1, 4 } };

        System.out.println("Input number to find:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Coordinates of number " + number + " in 2-dimensional array are following:");

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    System.out.println("[" + i + ", " + j + "]");
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Number not found in array");
        }

    }

}
