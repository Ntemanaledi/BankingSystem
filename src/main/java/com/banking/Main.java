package com.banking;

import com.banking.model.*;

public class Main {
    public static void main(String[] args) {
        Customer neo = new Customer("U001", "C001", "Neo", "Kago", "Gaborone");

        SavingsAccount savings = new SavingsAccount("S001", 1000, "Gaborone");
        InvestmentAccount invest = new InvestmentAccount("I001", 1000, "Gaborone");
        ChequeAccount cheque = new ChequeAccount("CH001", 2000, "Gaborone", "Botswana Railways", "Gaborone Station Rd");

        neo.openAccount(savings);
        neo.openAccount(invest);
        neo.openAccount(cheque);

        System.out.println("\n--- Deposits ---");
        neo.depositFunds(savings, 500);
        neo.depositFunds(invest, 500);

        System.out.println("\n--- Try withdraw from Savings (should FAIL) ---");
        savings.withdrawFunds(200);

        System.out.println("\n--- Withdraw from Cheque (should WORK) ---");
        cheque.withdrawFunds(200);

        System.out.println("\n--- Pay Interest ---");
        savings.payInterest();
        invest.payInterest();
        cheque.payInterest();

        System.out.println("\n--- Final Balances ---");
        System.out.println(savings);
        System.out.println(invest);
        System.out.println(cheque);
        System.out.println("Neo total balance: P" + neo.viewBalance());
    }
}
