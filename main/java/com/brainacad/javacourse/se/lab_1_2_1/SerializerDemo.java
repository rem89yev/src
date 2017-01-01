package com.brainacad.javacourse.se.lab_1_2_1;

import java.io.*;

/**
 * @author Dmitry Adonin
 * @since 11/09/16.
 */
public class SerializerDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("John");
        employee.setAddress("somewhere");
        employee.setSsn(12345678);
        employee.setNumber(1);

        File file = new File("./employee.ser");
        try (FileOutputStream fos = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos);) {
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
