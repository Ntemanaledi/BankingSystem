package com.banking.model;

public class InvestmentAccount extends Account implements InterestAccount {
    private double interestRate = 0.05; // 5% monthly from paper p.3
    private static final double MIN_OPENING = 500.00;

    public InvestmentAccount(String accountNumber, double balance, String branch) {
        super(accountNumber, balance, branch);
        if (balance < MIN_OPENING) System.out.println("WARNING: Investment needs minimum P500 to open!");
    }

    @Override
    public void depositFunds(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited P" + amount + " into Investment " + getAccountNumber());
    }

    @Override
    public void withdrawFunds(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew P" + amount + " from Investment " + getAccountNumber());
        } else System.out.println("Insufficient funds in Investment account!");
    }

    @Override
    public double calculateInterest() { return getBalance() * interestRate; }

    @Override
    public void payInterest() {
        double interest = calculateInterest();
        setBalance(getBalance() + interest);
        System.out.println("Interest P" + interest + " paid to Investment " + getAccountNumber());
    }
}
