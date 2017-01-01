package com.brainacad.javacourse.basics.oop.lab_2_17_6.testthread7;

/**
 * @author Dmitry Adonin
 * @since 05/09/16.
 */
public class DiningHall {

    static int pizzaNum;
    static int studentID;

    public void makePizza() {
        pizzaNum++;
    }

    public synchronized void servePizza(int i) {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else result = "Starved ";
        System.out.println(result + i/*studentID*/);
        //studentID++;
    }

    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) d.makePizza();
        for (int i = 0; i < 20; i++) {
            Thread student = new Thread(new Runnable() {
                @Override
                public void run() {
                    d.servePizza(Integer.valueOf(Thread.currentThread().getName()));
                }
            });
            student.setName("" + i);
            student.start();
        }
    }

}
