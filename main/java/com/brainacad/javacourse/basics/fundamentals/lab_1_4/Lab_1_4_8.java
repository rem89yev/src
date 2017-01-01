package com.brainacad.javacourse.basics.fundamentals.lab_1_4;

/**
 * @author Dmytro_Adonin
 * @since 8/8/16
 */
public class Lab_1_4_8 {

    public static void main(String[] args) {

        byte b = 127;
        short s = 256;
        char c = '\u0123'; // 'ģ'
        int i = 2000000;
        long l = 100500L;
        float f = 100500.5F;
        double d = 100500.5D;

        System.out.println("byte to short, int, long, float, or double");
        System.out.println((short) b);
        System.out.println((int) b);
        System.out.println((long) b);
        System.out.println((float) b);
        System.out.println((double) b);

        System.out.println("\nshort to int, long, float, or double");
        System.out.println((int) s);
        System.out.println((long) s);
        System.out.println((float) s);
        System.out.println((double) s);

        System.out.println("\nchar to int, long, float, or double");
        System.out.println((int) c);
        System.out.println((long) c);
        System.out.println((float) c);
        System.out.println((double) c);

        System.out.println("\nint to long, float, or double");
        System.out.println((long) i);
        System.out.println((float) i);
        System.out.println((double) i);

        System.out.println("\nlong to float or double");
        System.out.println((float) l);
        System.out.println((double) l);

        System.out.println("\nfloat to double");
        System.out.println((double) f);

        System.out.println("\nshort to byte or char");
        System.out.println((byte) s);
        System.out.println((char) s);

        System.out.println("\nchar to byte or short");
        System.out.println((byte) c);
        System.out.println((short) c);

        System.out.println("\nint to byte, short, or char");
        System.out.println((byte) i);
        System.out.println((short) i);
        System.out.println((char) i);

        System.out.println("\nlong to byte, short, char, or int");
        System.out.println((byte) l);
        System.out.println((short) l);
        System.out.println((char) l);
        System.out.println((int) l);

        System.out.println("\nfloat to byte, short, char, int, or long");
        System.out.println((byte) f);
        System.out.println((short) f);
        System.out.println((char) f);
        System.out.println((int) f);
        System.out.println((long) f);

        System.out.println("\ndouble to byte, short, char, int, long, or float");
        System.out.println((byte) d);
        System.out.println((short) d);
        System.out.println((char) d);
        System.out.println((int) d);
        System.out.println((long) d);
        System.out.println((float) d);

    }

}
