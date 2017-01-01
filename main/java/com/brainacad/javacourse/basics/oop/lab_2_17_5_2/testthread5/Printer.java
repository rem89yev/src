package com.brainacad.javacourse.basics.oop.lab_2_17_5_2.testthread5;

import static java.lang.Thread.sleep;

/**
 * @author Dmitry Adonin
 * @since 03/09/16.
 */
public class Printer implements Runnable {

    private Storage storage;
    private volatile boolean finished = false;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public void run() {
        while (!finished) {
            synchronized (storage) {
                System.out.println("Printing " + storage.getI());
                System.out.println("Doing something with result...");
                try {
                    sleep(1000);
                    storage.notify();
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Finished!");
    }


}
