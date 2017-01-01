package com.brainacad.javacourse.basics.oop.lab_2_15_1.testcollection1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Adonin
 * @since 27/08/16.
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add("number_" + i);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

}
