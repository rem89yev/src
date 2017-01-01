package com.brainacad.javacourse.basics.oop.lab_2_2_4;

/**
 * @author Dmitry Adonin
 * @since 12/08/16.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String phoneNumber;

    public void setField(String firstname) {
        this.firstName = firstname;
    }

    public void setField(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public void setField(String firstname, String lastName, int age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public void setField(String firstname, String lastName, int age, String gender) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void setField(String firstname, String lastName, int age, String gender, String phoneNumber) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
