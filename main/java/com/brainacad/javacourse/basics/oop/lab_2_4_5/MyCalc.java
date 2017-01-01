package com.brainacad.javacourse.basics.oop.lab_2_4_5;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class MyCalc {

    // replace -1 return after check with exceptions later
    public static double calcPi(int n) {
        if (n < 0) {
            System.out.println("N should be positive number");
            return -1;
        }
        boolean add = true;
        double pi = 0;
        for (int i = 1; i <= n; i += 2) {
            if (add) {
                pi += 4.0D / i;
            } else {
                pi -= 4.0D / i;
            }
            add = !add;
        }
        return pi;
    }

    public static void main(String[] args) {
        System.out.println("Pi is about " + calcPi(4000));
    }

}
