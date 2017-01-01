package com.brainacad.javacourse.basics.oop.lab_2_17_3.testthread2;

/**
 * @author Dmytro_Adonin
 * @since 9/2/16
 */
public class MySumCount extends Thread {

    private int startIndex;
    private int stopIndex;
    private long resultSum;
    private int[] arr;

    @Override
    public void run() {
        if (startIndex < 0 || stopIndex > arr.length) {
            System.out.println("Index should be positive and less than array length");
            return;
        }
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += arr[i];
        }
        System.out.println("I'm " + Thread.currentThread().getName() + ", sum = " + resultSum);
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

}
