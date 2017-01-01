package com.brainacad.javacourse.basics.oop.lab_2_14_2.testgenerics2;

/**
 * @author Dmitry Adonin
 * @since 25/08/16.
 */
public class MyTestMethod {

    public static <T extends Number & Comparable<T>> int calcNum(T[] arr, T maxelm) {
        int counter = 0;
        for (T item : arr) {
            if (item.compareTo(maxelm) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static <T> int calcEquals(T[] arr, T elem) {
        int counter = 0;
        for (T item : arr) {
            if (item.equals(elem)) {
                counter++;
            }
        }
        return counter;
    }

}
