package com.brainacad.javacourse.basics.oop.lab_2_12_2.testnest1;

/**
 * Created by malya on 23.08.16.
 */
public class Main {

    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Vasya", "111-11-11");
        myPhoneBook.addPhoneNumber("Peter", "222-22-22");
        myPhoneBook.printPhoneBook();

        System.out.println("Sort by name and print");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();

        System.out.println("Sort by phone and print");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();

    }

}
