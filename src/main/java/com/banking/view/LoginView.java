package com.banking.view;
import javax.swing.*;
public class LoginView extends JFrame {
    public JTextField userField = new JTextField(15);
    public JPasswordField passField = new JPasswordField(15);
    public JButton loginBtn = new JButton("Login");
    public LoginView() {
        setTitle("Banking System - Login"); setSize(350,200); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(); p.add(new JLabel("User ID:")); p.add(userField);
        p.add(new JLabel("Password:")); p.add(passField); p.add(loginBtn); add(p); setLocationRelativeTo(null);
    }
}
