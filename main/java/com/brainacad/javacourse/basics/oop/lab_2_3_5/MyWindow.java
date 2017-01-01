package com.brainacad.javacourse.basics.oop.lab_2_3_5;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class MyWindow {

    public static final double DEFAULT_WIDTH = 1;
    public static final double DEFAULT_HEIGHT = 1;
    public static final int DEFAULT_NUMBER_OF_GLASS = 1;
    public static final String DEFAULT_COLOR = "white";
    public static final boolean DEFAULT_IS_OPEN = false;

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
        this.numberOfGlass = DEFAULT_NUMBER_OF_GLASS;
        this.color = DEFAULT_COLOR;
        this.isOpen = DEFAULT_IS_OPEN;
    }

    public MyWindow(double width, double height) {
        this(width, height, DEFAULT_NUMBER_OF_GLASS);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, DEFAULT_COLOR, DEFAULT_IS_OPEN);
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public static void main(String[] args) {

        MyWindow myWindow1 = new MyWindow();
        MyWindow myWindow2 = new MyWindow(12, 13);
        MyWindow myWindow3 = new MyWindow(23, 34, 2);
        MyWindow myWindow4 = new MyWindow(34, 35, 3, "yellow", true);

        MyWindow[] myWindows = new MyWindow[] { myWindow1, myWindow2, myWindow3, myWindow4 };

        for (MyWindow window : myWindows) {
            window.printFields();
        }
    }

    public void printFields() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
