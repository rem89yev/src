package com.brainacad.javacourse.basics.misc;

/**
 * @author Dmitry Adonin
 * @since 06/09/16.
 */
public class Factorial {

    public static int iterate(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursion(int n) {
        if (n == 1) return 1;
        return n * recursion(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Iterative: " + iterate(5));
        System.out.println("Recursive: " + recursion(5));
    }
}
