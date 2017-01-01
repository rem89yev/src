package com.brainacad.javacourse.basics.oop.lab_2_4_4;

/**
 * @author Dmitry Adonin
 * @since 13/08/16.
 */
public class Employee {

    private static int numberOfEmployees = 0;

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        numberOfEmployees++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

}