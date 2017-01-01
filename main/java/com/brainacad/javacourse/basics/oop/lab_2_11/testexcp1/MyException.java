package com.brainacad.javacourse.basics.oop.lab_2_11.testexcp1;

/**
 * @author Dmitry Adonin
 * @since 18/08/16.
 */
public class MyException extends Exception {

    private String s;

    public MyException(String s) {
        this.s = s;
    }

    public void print() {
        System.out.println(s);
    }
}
