package com.brainacad.javacourse.basics.oop.lab_2_14_3;

/**
 * @author Dmitry Adonin
 * @since 26/08/16.
 */
public class Main {

    public static void main(String[] args) {

        Integer[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

        System.out.print("Array values: ");
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println("\nSum of values greater than 3: " + MyTestMethod.calcSum(integers, 3));

        System.out.print("Array values: ");
        for (Double i : doubles) {
            System.out.print(i + " ");
        }
        System.out.println("\nSum of values greater than 3: " + MyTestMethod.calcSum(doubles, 3.0));

    }

}
