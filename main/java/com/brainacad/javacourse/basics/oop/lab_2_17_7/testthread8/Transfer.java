package com.brainacad.javacourse.basics.oop.lab_2_17_7.testthread8;

import java.util.Random;

/**
 * @author Dmitry Adonin
 * @since 05/09/16.
 */
public class Transfer implements Runnable {

    private Bank bank;
    private int from;
    private int to;

    public Transfer(Bank bank, int from, int to) {
        this.bank = bank;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        Random random = new Random();
        bank.transfer(from, to, random.nextInt(bank.totalBalance()));
    }
}
