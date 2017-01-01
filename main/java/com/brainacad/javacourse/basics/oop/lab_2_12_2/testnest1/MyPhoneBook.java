package com.brainacad.javacourse.basics.oop.lab_2_12_2.testnest1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by malya on 23.08.16.
 */
public class MyPhoneBook {

    private int counter = 0;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        phoneNumbers[counter++] = new PhoneNumber(name, phone);
    }

    public void printPhoneBook() {
        for (int i = 0; i < counter; i++) {
            System.out.println(phoneNumbers[i]);
        }
    }

    public void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator() { // it should be generified and expressed with lambda, stay tune :)
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber p1 = (PhoneNumber) o1;
                PhoneNumber p2 = (PhoneNumber) o2;
                if (p1 == null && p2 != null) {
                    return 1;
                } else if (p1 != null && p2 == null) {
                    return -1;
                } else if (p1 == null && p2 == null) {
                    return 0;
                } else return p1.getName().compareTo(p2.getName());
            }
        });
    }

    public void sortByPhoneNumber() {
        Arrays.sort(phoneNumbers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber p1 = (PhoneNumber) o1;
                PhoneNumber p2 = (PhoneNumber) o2;
                if (p1 == null && p2 != null) {
                    return 1;
                } else if (p1 != null && p2 == null) {
                    return -1;
                } else if (p1 == null && p2 == null) {
                    return 0;
                } else return p1.getPhone().compareTo(p2.getPhone());
            }
        });
    }

    public static class PhoneNumber {

        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return name + " : " + phone;
        }
    }

}
