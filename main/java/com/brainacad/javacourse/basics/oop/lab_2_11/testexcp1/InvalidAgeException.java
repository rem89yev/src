package com.brainacad.javacourse.basics.oop.lab_2_11.testexcp1;

/**
 * @author Dmitry Adonin
 * @since 18/08/16.
 */
public class InvalidAgeException extends RuntimeException {


    public InvalidAgeException(String s) {
        super(s);
    }
}
