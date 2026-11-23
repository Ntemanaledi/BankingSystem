package com.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String customerId;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String userId, String customerId, String firstName, String surname, String address) {
        super(userId, firstName, surname, address);
        this.customerId = customerId;
    }

    public String getCustomerId() { return customerId; }
    public List<Account> getAccounts() { return accounts; }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened: " + account.getAccountNumber());
    }

    public void depositFunds(Account account, double amount) {
        account.depositFunds(amount);
    }

    public void depositFunds(double amount) {
        if (!accounts.isEmpty()) accounts.get(0).depositFunds(amount);
    }

    public void withdrawFunds(Account account, double amount) {
        account.withdrawFunds(amount);
    }

    @Override
    public double viewBalance() {
        double total = 0;
        for (Account a : accounts) total += a.getBalance();
        return total;
    }
}
