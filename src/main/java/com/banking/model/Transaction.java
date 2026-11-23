package com.banking.model;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String type;
    private double amount;
    private LocalDateTime date;
    private String accountNumber;

    public Transaction(String transactionId, String type, double amount, String accountNumber) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.date = LocalDateTime.now();
    }

    public String getTransactionId() { return transactionId; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public LocalDateTime getDate() { return date; }
    public String getAccountNumber() { return accountNumber; }

    @Override
    public String toString() {
        return transactionId + " | " + type + " P" + amount + " | Acc: " + accountNumber + " | " + date;
    }
}
