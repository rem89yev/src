package com.brainacad.javacourse.basics.oop.lab_2_9.teststring2;

/**
 * @author Dmitry Adonin
 * @since 17/08/16.
 */
public class Main {

    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        // can (should!) be improved not using same letter twice and not printing same matches several times,
        // calculating upper/lower case
        for (char source : myStr1.toCharArray()) {
            boolean flag = false;
            for (char target : myStr2.toCharArray()) {
                if (source == target) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(source);
            }
        }

        System.out.println(new String(uniqueChars("Using methods of class String")));

    }

    private static char[] uniqueChars(String s) {
        if (s.length() == 0) {
            return new char[0];
        } else if (s.length() == 1) {
            return new char[]{s.charAt(0)};
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                char c = s.charAt(i);
                if (s.substring(i + 1, s.length() - 1).indexOf(c, i + 1) == -1) {
                    stringBuilder.append(c);
                }
            }
            // improve it, extra operation can be avoid, I believe
            String substring = s.substring(s.length() - 1);
            if (stringBuilder.indexOf(substring) == -1) {
                stringBuilder.append(substring);
            }
            return stringBuilder.toString().toCharArray();
        }
    }

}
