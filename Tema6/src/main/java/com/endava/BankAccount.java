package com.endava;

public class BankAccount {

    private double balance;
    private int accountNumber;

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double ammount) {
        balance = balance + ammount;
    }

    public void withdraw(double ammount) {
        if (ammount > balance) {
            System.out.println("You don't have enough funds in your bank account.");
        } else {
            balance = balance - ammount;
        }
    }
}
