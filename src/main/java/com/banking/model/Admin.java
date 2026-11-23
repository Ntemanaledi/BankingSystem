package com.banking.model;

public class Admin extends Employee {
    public Admin(String userId, String employeeId, String firstName, String surname, String address, double salary) {
        super(userId, employeeId, firstName, surname, address, salary);
    }

    public void createAccount(Customer c, Account a) {
        c.openAccount(a);
        System.out.println("Admin " + getFirstName() + " created account " + a.getAccountNumber() + " for " + c.getFirstName());
    }

    public void deleteAccount(Customer c, Account a) {
        c.getAccounts().remove(a);
        System.out.println("Admin " + getFirstName() + " deleted account " + a.getAccountNumber());
    }

    public void manageUsers() {
        System.out.println("Admin " + getFirstName() + " is managing users...");
    }
}
