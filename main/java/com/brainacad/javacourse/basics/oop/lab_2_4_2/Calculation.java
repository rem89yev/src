package com.brainacad.javacourse.basics.oop.lab_2_4_2;

import com.brainacad.javacourse.basics.oop.lab_2_4_1.MyMath;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class Calculation {

    public static void main(String[] args) {

        int[] arr1 = {4, 7, 1, 8, 1};
        int[] arr2 = {1, 3, 9, -1, 5};

        System.out.println("Arr1 min = " + MyMath.findMin(arr1));
        System.out.println("Arr1 max = " + MyMath.findMax(arr1));
        System.out.println("Arr2 min = " + MyMath.findMin(arr2));
        System.out.println("Arr2 max = " + MyMath.findMax(arr2));

    }

}
