package com.brainacad.javacourse.basics.oop.lab_2_4_7;

/**
 * @author Dmitry Adonin
 * @since 14/08/16.
 */
public class GravityCalculator {

    public static final double EARTH_G = 9.81;

    public static double caclDist(double t) {
        // lets assume that initial velocity and position is zero
        double v = 0;
        double x = 0;
        return 0.5 * EARTH_G * Math.pow(t, 2) + v * t + x;
    }

    public static void main(String[] args) {
        System.out.println("Distance = " + caclDist(10));
    }

}
