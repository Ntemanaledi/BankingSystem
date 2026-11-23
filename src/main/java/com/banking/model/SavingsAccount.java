package com.banking.model;

public class SavingsAccount extends Account implements InterestAccount {
    private double interestRate = 0.0005; // 0.05% monthly from paper p.3

    public SavingsAccount(String accountNumber, double balance, String branch) {
        super(accountNumber, balance, branch);
    }

    @Override
    public void depositFunds(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited P" + amount + " into Savings " + getAccountNumber());
    }

    @Override
    public void withdrawFunds(double amount) {
        System.out.println("Withdrawals NOT allowed from Savings account!");
    }

    @Override
    public double calculateInterest() { return getBalance() * interestRate; }

    @Override
    public void payInterest() {
        double interest = calculateInterest();
        setBalance(getBalance() + interest);
        System.out.println("Interest P" + interest + " paid to Savings " + getAccountNumber());
    }
}
