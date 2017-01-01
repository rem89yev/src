package com.brainacad.javacourse.basics.fundamentals.lab_1_6;

import java.util.Arrays;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_6_2 {

    public static void main(String[] args) {

        int[] m = /* new int[] */ { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);

        System.out.println("Max: " + Lab_1_6_2.max(m));
        System.out.println("Min: " + Lab_1_6_2.min(m));
        System.out.println("Avg: " + Lab_1_6_2.avg(m));
        System.out.println("Median: " + Lab_1_6_2.median(m));

    }

    private static int max(int[] arr) {
        return arr[arr.length - 1];
    }

    private static int min(int[] arr) {
        return arr[0];
    }

    private static float avg(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum / (float) arr.length;
    }

    private static float median(int[] arr) {
        int arrLength = arr.length;
        if (arrLength % 2 == 0) {
            return (arr[arrLength/2] + arr[arrLength/2 - 1]) / 2F;
        } else {
            return arr[(arrLength - 1) / 2];
        }
    }

}
