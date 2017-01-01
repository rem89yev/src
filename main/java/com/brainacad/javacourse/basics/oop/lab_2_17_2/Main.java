package com.brainacad.javacourse.basics.oop.lab_2_17_2;

/**
 * @author Dmytro_Adonin
 * @since 9/2/16
 */
public class Main {

    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        new Thread(bomb1).start();
    }

}
