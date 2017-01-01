package com.brainacad.javacourse.basics.fundamentals.lab_1_6;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_6_1 {

    public static void main(String[] args) {

        int[] arr = /* new int[] */{ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };

        // old style
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // preferable
        for (int item: arr) {
            System.out.println(item);
        }

    }

}
