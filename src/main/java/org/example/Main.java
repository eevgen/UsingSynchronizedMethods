package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BankAccount.setBalance(500);
        MyThreadForTransactions myThread1 = new MyThreadForTransactions(true, 500);
        MyThreadForTransactions myThread2 = new MyThreadForTransactions(false, 200);
        MyThreadForTransactions myThread3 = new MyThreadForTransactions(true, 100);

        myThread1.start();
        myThread2.start();
        myThread3.start();

        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(BankAccount.getBalance());
    }
}