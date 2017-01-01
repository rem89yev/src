package com.brainacad.javacourse.basics.oop.lab_2_8.testshapes;

/**
 * @author Dmitry Adonin
 * @since 16/08/16.
 */
public interface Drawable {

    void draw();

    /*default void draw() {
        System.out.println(this);
        System.out.println("Area=" + this.calcArea()); // interface have no idea that implementor will have calcArea() :(
    }*/

}
