package com.brainacad.javacourse.basics.oop.lab_2_1;

import com.brainacad.javacourse.basics.oop.lab_2_1_2.Computer;

/**
 * @author Dmitry Adonin
 * @since 10/08/16.
 */
public class Lab_2_1_4 {

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            Computer computer = new Computer();
            computer.setSerialNumber(i + 1);
            computer.setManufacturer("Manufacturer" + (i + 1));
            computer.setPrice((i + 1) * 100);
            computer.setFrequencyCPU((i + 1) * 100);
            computer.setQuantitryCPU(i + 1);
            computers[i] = computer;
        }

        showComputersPrices(computers);

        for (Computer computer : computers) {
            computer.setPrice(computer.getPrice() * 1.1F);
        }

        showComputersPrices(computers);

    }

    private static void showComputersPrices(Computer[] computers) {
        System.out.println();
        for (Computer computer : computers) {
            System.out.println(computer.getSerialNumber() + " computer price is " + computer.getPrice());
        }
    }

}
