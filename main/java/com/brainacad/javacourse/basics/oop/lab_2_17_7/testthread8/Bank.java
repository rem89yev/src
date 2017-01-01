package com.brainacad.javacourse.basics.oop.lab_2_17_7.testthread8;

/**
 * @author Dmitry Adonin
 * @since 05/09/16.
 */
public class Bank {

    private int accounts[];
    private int numOfAccounts;

    public Bank(int numAccounts, int initBalance) {
        accounts = new int[numAccounts];
        numOfAccounts = numAccounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initBalance;
        }
    }

    /*synchronized*/ void transfer(int from, int to, int amount) {// uncomment synchronized for 2.17.7
        try {
            System.out.println("from: " + from + " to: " + to + " amount: " + amount);
            if (accounts[from] < amount) return;
            accounts[from] = accounts[from] - amount;
            Thread.sleep((int) (100 * Math.random()));
            accounts[to] = accounts[to] + amount;
            System.out.println("Total balance: " + totalBalance());
        } catch (InterruptedException e) {
        }
    }

    public int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total = total + v;

        }
        return total;
    }

    public int getNumberAccounts() {
        return numOfAccounts;
    }

}
