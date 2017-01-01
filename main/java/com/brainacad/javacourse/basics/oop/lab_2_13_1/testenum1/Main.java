package com.brainacad.javacourse.basics.oop.lab_2_13_1.testenum1;

/**
 * @author Dmytro_Adonin
 * @since 8/25/16
 */
public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            System.out.println(day.ordinal() + " : " + day.name());
        }

    }

}
