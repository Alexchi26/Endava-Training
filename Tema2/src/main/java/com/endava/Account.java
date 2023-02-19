package com.endava;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String accountId, String accountName) {
        this.id = accountId;
        this.name = accountName;
    }

    public Account(String accountId, String accountName, int accountBalance) {
        this.id = accountId;
        this.name = accountName;
        this.balance = accountBalance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("Amount exceeded balance!");
        }
        return balance;
    }

    public void transferTo(Account account, int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            account.balance = account.balance + amount;
        } else {
            System.out.println("Amount exceeded balance!");
        }
    }

    public String toString() {
        return "Account[id= " + this.id + ", name= " + this.name + ", balance= " + balance + "]";
    }

}
