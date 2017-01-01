package com.brainacad.javacourse.basics.oop.lab_2_17_5_2.testthread5;

import static java.lang.Thread.sleep;

/**
 * @author Dmitry Adonin
 * @since 03/09/16.
 */
public class Counter implements Runnable {

    private Storage storage;
    private Printer printer;

    public Counter(Storage storage, Printer printer) {
        this.storage = storage;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            synchronized (storage) {
                try {
                    System.out.println("Storing " + i);
                    sleep(1000);
                    storage.setI(i);
                    System.out.println("Storing finished");
                    storage.notify();
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (storage) {
            storage.notify();
            printer.setFinished(true);
        }
    }

}
