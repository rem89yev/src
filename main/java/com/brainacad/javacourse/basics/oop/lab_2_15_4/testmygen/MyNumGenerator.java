package com.brainacad.javacourse.basics.oop.lab_2_15_4.testmygen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Dmitry Adonin
 * @since 27/08/16.
 */
public class MyNumGenerator {

    private int numOfElem;
    private int maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numOfElem; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

}
