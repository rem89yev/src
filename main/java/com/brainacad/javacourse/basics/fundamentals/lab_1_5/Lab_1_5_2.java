package com.brainacad.javacourse.basics.fundamentals.lab_1_5;

import java.util.Scanner;

/**
 * @author Dmytro_Adonin
 * @since 8/9/16
 */
public class Lab_1_5_2 {

    public static void main(String[] args) {

        System.out.println("Enter number x:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println("One");
        } else if (x == 2) {
            System.out.println("Two");
        } else if (x == 3) {
            System.out.println("Three");
        } else if (x == 4) {
            System.out.println("Four");
        } else if (x == 5) {
            System.out.println("Five");
        } else if (x == 6) {
            System.out.println("Six");
        } else if (x == 7) {
            System.out.println("Seven");
        } else if (x == 8) {
            System.out.println("Eight");
        } else if (x == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }

        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
        }

    }

}
