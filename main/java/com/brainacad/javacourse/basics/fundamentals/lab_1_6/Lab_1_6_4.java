package com.brainacad.javacourse.basics.fundamentals.lab_1_6;

import java.util.Arrays;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_6_4 {

    public static void main(String[] args) {

        int[] arr = /* new int[] */{ 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 10));

    }

}
