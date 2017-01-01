package com.brainacad.javacourse.basics.oop.lab_2_10.testwrapper;

/**
 * @author Dmytro_Adonin
 * @since 8/18/16
 */
public class Main {

    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = new Integer(127);
        Integer i3 = Integer.valueOf(127);
        Integer i4 = Integer.parseInt("127");

        System.out.println("i1 == i2 = " + (i1 == i2));
        System.out.println("i1 equals i2 = " + (i1.equals(i2)));
        System.out.println("i1 == i3 = " + (i1 == i3));
        System.out.println("i1 equals i3 = " + (i1.equals(i3)));
        System.out.println("i1 == i4 = " + (i1 == i4));
        System.out.println("i1 equals i4 = " + (i1.equals(i4)));
        System.out.println("i2 == i3 = " + (i2 == i3));
        System.out.println("i2 equals i3 = " + (i2.equals(i3)));
        System.out.println("i2 == i4 = " + (i2 == i4));
        System.out.println("i2 equals i4 = " + (i2.equals(i4)));
        System.out.println("i3 == i4 = " + (i3 == i4));
        System.out.println("i3 equals i4 = " + (i3.equals(i4)) + "\n");

        Integer i11 = 128;
        Integer i21 = new Integer(128);
        Integer i31 = Integer.valueOf(128);
        Integer i41 = Integer.parseInt("128");

        System.out.println("i11 == i21 = " + (i11 == i21));
        System.out.println("i11 equals i21 = " + (i11.equals(i21)));
        System.out.println("i11 == i31 = " + (i11 == i31));
        System.out.println("i11 equals i31 = " + (i11.equals(i31)));
        System.out.println("i11 == i41 = " + (i11 == i41));
        System.out.println("i11 equals i41 = " + (i11.equals(i41)));
        System.out.println("i21 == i31 = " + (i21 == i31));
        System.out.println("i21 equals i31 = " + (i21.equals(i31)));
        System.out.println("i21 == i41 = " + (i21 == i41));
        System.out.println("i21 equals i41 = " + (i21.equals(i41)));
        System.out.println("i31 == i41 = " + (i3 == i41));
        System.out.println("i31 equals i41 = " + (i31.equals(i41)));

    }

}
