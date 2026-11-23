package com.banking;
import com.banking.model.*;
import com.banking.dao.*;
public class IntegrationTest {
    public static void main(String[] args) {
        System.out.println("=== INTEGRATION TEST ===");
        Customer neo = new Customer("U001", "C001", "Neo", "Kago", "Gaborone");
        Account s = new SavingsAccount("S001", 1000, "Gaborone");
        neo.openAccount(s); s.depositFunds(500);
        System.out.println("Test 1 - Deposit: " + (s.getBalance()==1500 ? "PASS" : "FAIL"));
        double interest = ((InterestAccount)s).calculateInterest();
        s.depositFunds(interest);
        System.out.println("Test 2 - Interest: " + (s.getBalance()>1500 ? "PASS" : "FAIL") + " Balance P"+s.getBalance());
        CustomerDAO cdao = new CustomerDAO(); cdao.save(neo);
        AccountDAO adao = new AccountDAO(); adao.save(s); adao.update(s);
        System.out.println("Test 3 - DAO: " + (cdao.findById("C001")!=null ? "PASS" : "FAIL"));
        try { new InvestmentAccount("I001", 100, "Gaborone"); System.out.println("Test 4 - Min deposit: FAIL"); }
        catch (Exception e){ System.out.println("Test 4 - Min deposit P500: PASS"); }
        System.out.println("=== ALL INTEGRATION TESTS DONE ===");
    }
}
