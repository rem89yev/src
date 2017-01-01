package com.brainacad.javacourse.basics.fundamentals.lab_1_5;

import java.util.Scanner;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_5_5 {

    public static void main(String[] args) {

        System.out.println("Input upper bound N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        float avg;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        avg = sum / (float) n;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);

    }

}
