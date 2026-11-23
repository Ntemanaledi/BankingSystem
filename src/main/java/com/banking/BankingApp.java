package com.banking;
import com.banking.view.LoginView;
import com.banking.controller.LoginController;
import javax.swing.SwingUtilities;
public class BankingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginView v = new LoginView(); new LoginController(v); v.setVisible(true);
        });
    }
}
