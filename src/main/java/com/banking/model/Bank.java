package com.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public Bank(String bankName) { this.bankName = bankName; }

    public String getBankName() { return bankName; }

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Bank added customer: " + c.getFirstName() + " " + c.getSurname());
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Bank added employee: " + e.getFirstName());
    }

    public void addAccount(Account a) { accounts.add(a); }

    public Customer findCustomer(String customerId) {
        for (Customer c : customers) if (c.getCustomerId().equals(customerId)) return c;
        return null;
    }

    public void listCustomers() {
        System.out.println("\n--- Customers at " + bankName + " ---");
        for (Customer c : customers) System.out.println(c.getCustomerId() + " | " + c.getFirstName() + " " + c.getSurname() + " | Total: P" + c.viewBalance());
    }
}
