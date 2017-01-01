package com.brainacad.javacourse.se.lab_1_2_1;

import java.io.Serializable;

/**
 * @author Dmitry Adonin
 * @since 11/09/16.
 */
public class Employee implements Serializable {

    private String name;
    private String address;
    private transient int ssn; // for 1.2.3 lab
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", number=" + number +
                '}';
    }
}
