package com.banking.controller;
import com.banking.model.*;
import com.banking.view.AccountView;
public class AccountController {
    private Customer customer; private AccountView view; private Account account;
    public AccountController(Customer c) {
        this.customer = c; this.account = new SavingsAccount("S001", 1000, "Gaborone");
        customer.openAccount(account); this.view = new AccountView(c.getFirstName());
        view.depositBtn.addActionListener(e -> deposit());
        view.withdrawBtn.addActionListener(e -> withdraw());
        view.interestBtn.addActionListener(e -> payInterest());
        updateBalance();
    }
    public void show(){ view.setVisible(true); }
    private void deposit() { try { double a = Double.parseDouble(view.amountField.getText()); account.depositFunds(a); view.log("Deposited P"+a); updateBalance(); } catch (Exception e){ view.log("Invalid amount"); } }
    private void withdraw() { try { double a = Double.parseDouble(view.amountField.getText()); account.withdrawFunds(a); view.log("Withdraw attempt P"+a); updateBalance(); } catch (Exception e){ view.log("Invalid amount"); } }
    private void payInterest() { if (account instanceof InterestAccount) { double i = ((InterestAccount)account).calculateInterest(); account.depositFunds(i); view.log("Interest paid"); updateBalance(); } }
    private void updateBalance(){ view.balanceLabel.setText("Balance: P"+account.getBalance()); }
}
