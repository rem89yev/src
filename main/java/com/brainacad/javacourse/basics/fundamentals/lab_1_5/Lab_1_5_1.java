package com.brainacad.javacourse.basics.fundamentals.lab_1_5;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_5_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
