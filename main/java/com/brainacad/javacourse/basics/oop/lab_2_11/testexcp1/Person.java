package com.brainacad.javacourse.basics.oop.lab_2_11.testexcp1;

/**
 * @author Dmitry Adonin
 * @since 18/08/16.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            throw new InvalidAgeException("Age should be > 1 and < 120, actual value: " + age);
        }
        this.age = age;
    }

}
