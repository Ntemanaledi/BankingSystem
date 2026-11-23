package com.banking.model;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String branch;

    public Account(String accountNumber, double balance, String branch) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getBranch() { return branch; }
    protected void setBalance(double balance) { this.balance = balance; }

    public abstract void depositFunds(double amount);
    public abstract void withdrawFunds(double amount);
    public abstract void payInterest();

    @Override
    public String toString() {
        return accountNumber + " | Branch: " + branch + " | Balance: P" + balance;
    }
}
