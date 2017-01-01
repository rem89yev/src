package com.brainacad.javacourse.basics.oop.lab_2_14_1.testgenerics1;

/**
 * @author Dmitry Adonin
 * @since 25/08/16.
 */
public class MyTuple<A, B, C> {

    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
