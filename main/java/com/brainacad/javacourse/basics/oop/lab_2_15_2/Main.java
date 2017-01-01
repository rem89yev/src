package com.brainacad.javacourse.basics.oop.lab_2_15_2;

import java.util.Set;

/**
 * @author Dmitry Adonin
 * @since 27/08/16.
 */
public class Main {

    public static void main(String[] args) {

        MyNumGenerator generator = new MyNumGenerator();
        Set<Integer> set = generator.generateDistinct(10, 100);
        for (Integer i : set) {
            System.out.println(i);
        }

    }

}
