package com.brainacad.javacourse.basics.oop.lab_2_14_4.testgenerics3;

import java.util.Random;

/**
 * @author Dmitry Adonin
 * @since 26/08/16.
 */
public class MyMixer<T> {

    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shuffle() {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            T a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

}
