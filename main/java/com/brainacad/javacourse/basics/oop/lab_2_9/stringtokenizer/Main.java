package com.brainacad.javacourse.basics.oop.lab_2_9.stringtokenizer;

import java.util.StringTokenizer;

/**
 * @author Dmitry Adonin
 * @since 17/08/16.
 */
public class Main {

    public static void main(String[] args) {

        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";

        StringTokenizer whitespaceTokenizer = new StringTokenizer(myStr);
        while (whitespaceTokenizer.hasMoreElements()) {
            System.out.println(whitespaceTokenizer.nextElement());
        }

        StringTokenizer commaTokenizer = new StringTokenizer(myStr, ",");
        while (commaTokenizer.hasMoreElements()) {
            System.out.println(commaTokenizer.nextElement());
        }

        StringTokenizer dotTokenizer = new StringTokenizer(myStr, ".");
        while (dotTokenizer.hasMoreElements()) {
            System.out.println(dotTokenizer.nextElement());
        }

    }

}
