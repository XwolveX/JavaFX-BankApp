package com.javafxbankapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginPageController {
    @FXML
    private TextField usernameField;  // Matches FXML
    @FXML
    private PasswordField passwordField; // Use PasswordField for security
    @FXML
    private Button loginButton;

    @FXML
    public void loginButtonClicked(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Please enter both username and password.");
        } else {
            System.out.println("Logging in with username: " + username);
        }
    }
}
