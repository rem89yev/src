package com.brainacad.javacourse.basics.oop.lab_2_12_5.testnest2;

/**
 * Created by malya on 23.08.16.
 */
public class MyTestClass {

    public void test() {
        class MyLocal {}
        MyLocal myLocal = new MyLocal();
        MyStaticNested myStaticNested = new MyStaticNested();
        MyTestClass myTestClass = new MyTestClass();
    }

    static class MyStaticNested {}

}
