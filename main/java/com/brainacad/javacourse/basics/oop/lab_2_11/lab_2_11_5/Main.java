package com.brainacad.javacourse.basics.oop.lab_2_11.lab_2_11_5;

/**
 * @author Dmytro_Adonin
 * @since 8/19/16
 */
public class Main {

    public static void main(String[] args) {

        Long result = compute((byte) 1, 1000);
        assert result.equals(new Long(10010)) : "Unexpected result of computation"; // use with "-ea" VM option
        System.out.println(result);
    }

    private static Long compute(Byte b, Integer i) {
        return Long.valueOf(b + i);
    }

}
