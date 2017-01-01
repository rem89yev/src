package com.brainacad.javacourse.basics.fundamentals.lab_1_6;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_6_3 {

    public static void main(String[] args) {

        int[][] arr = /* new int[][] */{ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }

}
