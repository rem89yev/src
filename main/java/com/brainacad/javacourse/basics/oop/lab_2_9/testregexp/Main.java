package com.brainacad.javacourse.basics.oop.lab_2_9.testregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dmitry Adonin
 * @since 17/08/16.
 */
public class Main {

    public static void main(String[] args) {
        String[] strings = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String s : strings) {
            System.out.println(s + " : " + checkPersonWithRegExp(s));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("[A-Z]([a-z]+)");
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }

}
