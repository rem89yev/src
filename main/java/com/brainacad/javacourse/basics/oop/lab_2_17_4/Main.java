package com.brainacad.javacourse.basics.oop.lab_2_17_4;

import java.util.Random;

/**
 * @author Dmitry Adonin
 * @since 03/09/16.
 */
public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[1000];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }

        MySumCount mySumCount1 = new MySumCount();
        mySumCount1.setArr(myArray);
        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(1000);

        MySumCount mySumCount2 = new MySumCount();
        mySumCount2.setArr(myArray);
        mySumCount2.setStartIndex(100);
        mySumCount2.setStopIndex(200);

        new Thread(mySumCount1).start();
        new Thread(mySumCount2).start();

    }

}
