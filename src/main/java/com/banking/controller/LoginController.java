package com.banking.controller;
import com.banking.model.Customer;
import com.banking.view.LoginView;
import javax.swing.*;
public class LoginController {
    private LoginView view;
    public LoginController(LoginView view) { this.view = view; view.loginBtn.addActionListener(e -> login()); }
    private void login() {
        String id = view.userField.getText().trim();
        if (id.isEmpty()) { JOptionPane.showMessageDialog(view, "Enter User ID"); return; }
        Customer c = new Customer("U001", id, "Neo", "Kago", "Gaborone");
        JOptionPane.showMessageDialog(view, "Welcome " + c.getFirstName());
        new AccountController(c).show(); view.dispose();
    }
}
