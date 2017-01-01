package com.brainacad.javacourse.basics.oop.lab_2_3_1;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public static void main(String[] args) {
        MyWindow myWindow1 = new MyWindow(1, 1, 1, "white", true);
        MyWindow myWindow2 = new MyWindow(2, 2, 2, "black", false);
        MyWindow myWindow3 = new MyWindow(3, 3, 3, "green", true);
        MyWindow myWindow4 = new MyWindow(4, 4, 4, "yellow", false);
        MyWindow myWindow5 = new MyWindow(5, 5, 5, "red", true);
    }

}
