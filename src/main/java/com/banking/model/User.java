package com.banking.model;

public abstract class User {
    private String userId;
    private String firstName;
    private String surname;
    private String address;

    public User(String userId, String firstName, String surname, String address) {
        this.userId = userId;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
    }

    public String getUserId() { return userId; }
    public String getFirstName() { return firstName; }
    public String getSurname() { return surname; }
    public String getAddress() { return address; }

    public boolean login() { return true; }
    public double viewBalance() { return 0; }
    public String viewTransactionHistory() { return "No history yet"; }
}
