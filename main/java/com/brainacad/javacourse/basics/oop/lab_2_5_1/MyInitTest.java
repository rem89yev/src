package com.brainacad.javacourse.basics.oop.lab_2_5_1;

/**
 * @author Dmitry Adonin
 * @since 14/08/16.
 */
public class MyInitTest {

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest() {
        this(null);
        System.out.println("constructor 1");
    }

    public MyInitTest(String s) {
        System.out.println("constructor 2");
    }

    public static void main(String[] args) {
        new MyInitTest();
    }
}
