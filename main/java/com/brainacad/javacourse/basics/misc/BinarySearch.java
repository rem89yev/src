package com.brainacad.javacourse.basics.misc;

/**
 * @author Dmitry Adonin
 * @since 06/09/16.
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] data = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(search(data, 0, data.length, 33));

    }

    public static int search(int[] data, int low, int high, int k) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        } else if (data[mid] == k) {
            return mid;
        } else if (data[mid] < k) {
            return search(data, mid + 1, high, k);
        } else {
            return search(data, low, mid - 1, k);
        }
    }

}
