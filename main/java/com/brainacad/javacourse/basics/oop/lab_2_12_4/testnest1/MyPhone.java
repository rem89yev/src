package com.brainacad.javacourse.basics.oop.lab_2_12_4.testnest1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by malya on 23.08.16.
 */
public class MyPhone {

    private MyPhoneBook phoneBook;

    public MyPhone() {
    }

    public void switchOn() {
        System.out.println("Loading records...");
        phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Vasya", "111-11-11");
        phoneBook.addPhoneNumber("Peter", "222-22-22");
        System.out.println("OK");
    }

    public void call(int i) {
        System.out.println("Calling to " + phoneBook.phoneNumbers[i]);
    }

    class MyPhoneBook {

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

        public class PhoneNumber {

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

    class PhoneBattery {}

    static class PowerOnButton {}
    static class Bluetooth {}
    static class PhoneDisplay {}
    static class PhoneSpeaker {}
    static class Camera {}
    static class TouchScreen {}

}

class MemoryCard {}
class SimCard {}
class HeadPhones {}
class PhoneCharger {}
