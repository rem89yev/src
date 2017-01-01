package com.brainacad.javacourse.basics.oop.lab_2_9.teststrings1;

/**
 * @author Dmitry Adonin
 * @since 17/08/16.
 */
public class Main {

    public static void main(String[] args) {

        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(reverseString(myStr));

    }

    private static String reverseString(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            chars[i] = s.charAt(j);
        }
        return new String(chars);
    }

}
