package com.brainacad.javacourse.basics.oop.lab_2_12_1.testnest1;

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
