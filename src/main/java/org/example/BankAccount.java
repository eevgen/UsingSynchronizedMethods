package org.example;

public class BankAccount {

    private static int balance;

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        BankAccount.balance = balance;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " is completed");
    }

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw of " + amount + " is completed");
        } else {
            System.out.println("Not enough money");
        }
    }

}
