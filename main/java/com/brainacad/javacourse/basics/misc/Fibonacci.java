package com.brainacad.javacourse.basics.misc;

/**
 * @author Dmitry Adonin
 * @since 06/09/16.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("First " + n + " numbers in Fibonacci sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fib(i - 1) + fib(i - 2);
    }

}
