package com.banking.model;

public class ChequeAccount extends Account implements InterestAccount {
    private String employee;
    private String companyAddress;

    public ChequeAccount(String accountNumber, double balance, String branch, String employee, String companyAddress) {
        super(accountNumber, balance, branch);
        this.employee = employee;
        this.companyAddress = companyAddress;
    }

    public String getEmployee() { return employee; }
    public String getCompanyAddress() { return companyAddress; }

    @Override
    public void depositFunds(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited P" + amount + " into Cheque " + getAccountNumber());
    }

    @Override
    public void withdrawFunds(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew P" + amount + " from Cheque " + getAccountNumber());
        } else System.out.println("Insufficient funds in Cheque account!");
    }

    @Override
    public double calculateInterest() { return 0; }

    @Override
    public void payInterest() {
        System.out.println("Cheque account earns no interest.");
    }
}
