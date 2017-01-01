package com.brainacad.javacourse.basics.oop.lab_2_14_4.testgenerics3;

/**
 * @author Dmitry Adonin
 * @since 26/08/16.
 */
public class Main {

    public static void main(String[] args) {

        Integer[] shuffledInts = new MyMixer<>(new Integer[]{6, 7, 4, 3, 2, 9, 1, 5, 8}).shuffle();
        for (Integer i : shuffledInts) {
            System.out.print(i + " ");
        }

        System.out.println();

        String[] shuffledStrings = new MyMixer<>(new String[]{"one", "two", "three", "four"}).shuffle();
        for (String s : shuffledStrings) {
            System.out.print(s + " ");
        }

    }

}
