package com.brainacad.javacourse.basics.oop.lab_2_17_1.testthread1;

/**
 * @author Dmytro_Adonin
 * @since 9/2/16
 */
public class MyTimeBomb extends Thread {

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Boom!!!");
    }

}
