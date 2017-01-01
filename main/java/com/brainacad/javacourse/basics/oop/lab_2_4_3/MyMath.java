package com.brainacad.javacourse.basics.oop.lab_2_4_3;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class MyMath {

    public static final double PI = 3.14;

    // emptiness should be checked, min can be first element of sorted array
    public static int findMin(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // emptiness should be checked, max can be last element of sorted array
    public static int findMax(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static double areaOfCircle(double radius) {
        return PI * radius * radius; //return PI * Math.pow(radius, 2);
    }

}
