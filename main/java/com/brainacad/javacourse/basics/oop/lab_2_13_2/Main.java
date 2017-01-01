package com.brainacad.javacourse.basics.oop.lab_2_13_2;

import com.brainacad.javacourse.basics.oop.lab_2_13_1.testenum1.MyDayOfWeek;

/**
 * @author Dmytro_Adonin
 * @since 8/25/16
 */
public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case TUESDAY:
                    printMessage(day);
                    break;
                case THURSDAY:
                    printMessage(day);
                    break;
                case SATURDAY:
                    printMessage(day);
                    break;
                default:
                    break;
            }
        }

    }

    private static void printMessage(MyDayOfWeek day) {
        System.out.println("My Java day: " + day);
    }

}
