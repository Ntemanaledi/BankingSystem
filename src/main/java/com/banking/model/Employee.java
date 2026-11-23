package com.banking.model;

public class Employee extends User {
    private String employeeId;
    private double salary;

    public Employee(String userId, String employeeId, String firstName, String surname, String address, double salary) {
        super(userId, firstName, surname, address);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    public void processTransaction(String details) {
        System.out.println("Employee " + getFirstName() + " processed: " + details);
    }

    public void assistCustomer(Customer c) {
        System.out.println("Employee " + getFirstName() + " assisting customer " + c.getFirstName() + " " + c.getSurname());
    }
}
