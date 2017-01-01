package com.brainacad.javacourse.basics.oop.lab_2_17_1.testthread1;

/**
 * @author Dmytro_Adonin
 * @since 9/2/16
 */
public class Main {

    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        bomb1.start();
    }

}
