package com.banking.view;
import javax.swing.*;
public class AccountView extends JFrame {
    public JLabel balanceLabel = new JLabel("Balance: P0.0");
    public JTextField amountField = new JTextField(10);
    public JButton depositBtn = new JButton("Deposit");
    public JButton withdrawBtn = new JButton("Withdraw");
    public JButton interestBtn = new JButton("Pay Interest");
    public JTextArea logArea = new JTextArea(10,30);
    public AccountView(String n) {
        setTitle("Account - " + n); setSize(400,400); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(); p.add(balanceLabel); p.add(new JLabel("Amount:")); p.add(amountField);
        p.add(depositBtn); p.add(withdrawBtn); p.add(interestBtn); p.add(new JScrollPane(logArea)); add(p); setLocationRelativeTo(null);
    }
    public void log(String s){ logArea.append(s+"\n"); }
}
