package com.brainacad.javacourse.basics.oop.lab_2_11.lab_2_11_4;

/**
 * @author Dmitry Adonin
 * @since 18/08/16.
 */
public class InvalidShapeStringException extends Exception {

    public InvalidShapeStringException() {
        super("Shape template have to be like \"rectangle:RED:10,20\"");
    }
}
