package com.brainacad.javacourse.basics.oop.lab_2_11.testexcp1;

/**
 * @author Dmitry Adonin
 * @since 18/08/16.
 */
public class Main {

    public static void main(String[] args) {

        try {
            throw new Exception("message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }

        try {
            throw new MyException("my exception message");
        } catch (MyException e) {
            e.print();
        }

        try {
            new MyTest().test();
        } catch (MyException e) {
            e.printStackTrace();
        }

        try {
            MyTest ref = null;
            ref.test();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

        try {
            Person person = new Person();
            person.setAge(100500);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }


    }


}
