package com.brainacad.javacourse.basics.oop.lab_2_5_2;

/**
 * @author Dmitry Adonin
 * @since 14/08/16.
 */
public class MyInit {

    private /*static*/ int[] arr;
    // uncomment static's for Lab 2.5.3 and Lab 2.5.4 respectively
    /*static*/ {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public void printArray() {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
