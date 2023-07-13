package org.example;

public class MyThreadForTransactions extends Thread{

    private boolean isDeposit;
    private int amount;

    public MyThreadForTransactions(boolean isDeposit, int amount) {
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if(isDeposit) {
            new BankAccount(BankAccount.getBalance()).deposit(amount);
        } else {
            new BankAccount(BankAccount.getBalance()).withdraw(amount);
        }
    }
}
