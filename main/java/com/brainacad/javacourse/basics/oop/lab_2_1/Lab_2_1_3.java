package com.brainacad.javacourse.basics.oop.lab_2_1;

import com.brainacad.javacourse.basics.oop.lab_2_1_1.Computer;

/**
 * @author Dmitry Adonin
 * @since 10/08/16.
 */
public class Lab_2_1_3 {

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        for (Computer computer : computers) {
            System.out.println(computer);
        }

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }

        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }

}
