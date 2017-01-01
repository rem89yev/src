package com.brainacad.javacourse.basics.oop.lab_2_14_2.testgenerics2;

/**
 * @author Dmitry Adonin
 * @since 25/08/16.
 */
public class Main {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 2, 1, 2, 3, 2, 1};
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

        System.out.print("Array values: ");
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumber of values equals 3: " + MyTestMethod.calcEquals(integers, 3));

        System.out.print("Array values: ");
        for (Double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println("\nNumber of values greater than 3.3: " + MyTestMethod.calcNum(doubles, 3.3));

    }

}
