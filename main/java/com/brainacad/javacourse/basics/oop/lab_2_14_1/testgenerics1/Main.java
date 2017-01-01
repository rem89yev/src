package com.brainacad.javacourse.basics.oop.lab_2_14_1.testgenerics1;

/**
 * @author Dmitry Adonin
 * @since 25/08/16.
 */
public class Main {

    public static void main(String[] args) {

        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("a", 1, 2L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(1.0, "b", "c");

    }

}
