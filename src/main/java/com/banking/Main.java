package com.banking;

import com.banking.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BOTSWANA BANKING SYSTEM ===");

        Bank bank = new Bank("Bank of Botswana");
        Customer neo = new Customer("U001", "C001", "Neo", "Kago", "Gaborone");
        bank.addCustomer(neo);

        Employee tumi = new Employee("U002", "E001", "Tumi", "Molefe", "Gaborone", 8000);
        Admin admin = new Admin("U003", "A001", "Kabelo", "Dube", "Gaborone", 15000);
        bank.addEmployee(tumi);
        bank.addEmployee(admin);
        tumi.assistCustomer(neo);
        admin.manageUsers();

        SavingsAccount savings = new SavingsAccount("S001", 1000, "Gaborone");
        InvestmentAccount invest = new InvestmentAccount("I001", 1000, "Gaborone");
        ChequeAccount cheque = new ChequeAccount("CH001", 2000, "Gaborone", "Botswana Railways", "Gaborone Station Rd");

        admin.createAccount(neo, savings);
        admin.createAccount(neo, invest);
        admin.createAccount(neo, cheque);

        System.out.println("\n--- Deposits ---");
        neo.depositFunds(savings, 500);
        neo.depositFunds(invest, 500);
        Transaction t1 = new Transaction("T001", "Deposit", 500, "S001");
        System.out.println(t1);

        System.out.println("\n--- Try withdraw from Savings (should FAIL) ---");
        savings.withdrawFunds(200);

        System.out.println("\n--- Withdraw from Cheque (should WORK) ---");
        cheque.withdrawFunds(200);
        Transaction t2 = new Transaction("T002", "Withdraw", 200, "CH001");
        System.out.println(t2);
        tumi.processTransaction("Withdraw P200 from CH001");

        System.out.println("\n--- Pay Interest ---");
        savings.payInterest();
        invest.payInterest();
        cheque.payInterest();

        System.out.println("\n--- Loan ---");
        Loan loan = new Loan("L001", 10000, 0.10, neo);
        System.out.println(loan);
        System.out.println("Loan approved? " + loan.approveLoan());

        System.out.println("\n--- Final Balances ---");
        System.out.println(savings);
        System.out.println(invest);
        System.out.println(cheque);
        System.out.println("Neo total balance: P" + neo.viewBalance());
        bank.listCustomers();
        System.out.println("\n=== END OF DEMO ===");
    }
}
