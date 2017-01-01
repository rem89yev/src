package com.brainacad.javacourse.basics.fundamentals.lab_1_4;

/**
 * @author Dmytro_Adonin
 * @since 8/8/16
 */
public class Lab_1_4_3 {

    public static void main(String[] args) {

        boolean t = true, f = false;

        System.out.println("true & true = " + (t & t));
        System.out.println("true & false = " + (t & f));
        System.out.println("false & true = " + (f & t));
        System.out.println("false & false = " + (f & f) + "\n");

        System.out.println("true | true = " + (t | t));
        System.out.println("true | false = " + (t | f));
        System.out.println("false | true = " + (f | t));
        System.out.println("false | false = " + (f | f) + "\n");

        System.out.println("true ^ true = " + (t ^ t));
        System.out.println("true ^ false = " + (t ^ f));
        System.out.println("false ^ true = " + (f ^ t));
        System.out.println("false ^ false = " + (f ^ f) + "\n");

        System.out.println("! true = " + !t);
        System.out.println("! false = " + !f);

    }

}
