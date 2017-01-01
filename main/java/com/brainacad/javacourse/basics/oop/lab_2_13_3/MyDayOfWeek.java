package com.brainacad.javacourse.basics.oop.lab_2_13_3;

/**
 * @author Dmytro_Adonin
 * @since 8/25/16
 */
public enum MyDayOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay() {
        if (this.ordinal() == MyDayOfWeek.values().length - 1) {
            return SUNDAY;
        } else {
            return MyDayOfWeek.values()[this.ordinal() + 1];
        }
    }
}
