package com.brainacad.javacourse.basics.oop.lab_2_1_5;

/**
 * @author Dmitry Adonin
 * @since 10/08/16.
 */
public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantitryCPU;
    private int frequencyCPU;

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setSerialNumber(123456);
        computer.setManufacturer("IBM");
        computer.setPrice(1000);
        computer.setFrequencyCPU(2000);
        computer.setQuantitryCPU(2);

        computer.view();

    }

    public void view() {
        System.out.println("Manufacturer:  " + this.getManufacturer());
        System.out.println("Serial number: " + this.getSerialNumber());
        System.out.println("Price:         " + this.getPrice());
        System.out.println("CPU quantity:  " + this.getQuantitryCPU());
        System.out.println("CPU frequency: " + this.getFrequencyCPU());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantitryCPU() {
        return quantitryCPU;
    }

    public void setQuantitryCPU(int quantitryCPU) {
        this.quantitryCPU = quantitryCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

}
