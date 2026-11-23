package com.banking.model;

public class Loan {
    private String loanId;
    private double loanAmount;
    private double interestRate;
    private Customer customer;

    public Loan(String loanId, double loanAmount, double interestRate, Customer customer) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.customer = customer;
    }

    public String getLoanId() { return loanId; }
    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public Customer getCustomer() { return customer; }

    public double calculateRepayment() {
        return loanAmount + (loanAmount * interestRate);
    }

    public boolean approveLoan() {
        // Simple rule: approve if customer total balance > 1000
        return customer.viewBalance() > 1000;
    }

    @Override
    public String toString() {
        return loanId + " | Customer: " + customer.getFirstName() + " | Amount: P" + loanAmount + " | Repay: P" + calculateRepayment();
    }
}
