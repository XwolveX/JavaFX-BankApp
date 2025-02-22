package com.javafxbankapp.controller;

import com.javafxbankapp.Implement.SessionManager;
import com.javafxbankapp.structure.Customer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
    @FXML
    private Button loginButton;
    @FXML
    public void loginButtonClicked(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        Customer loggedInCustomer = Customer.validateLogin(username, password);

        if (loggedInCustomer != null) {
            SessionManager.setCustomer(loggedInCustomer);
            try {
                // Load scene
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/javafxbankapp/MainPage.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            errorLabel.setText("Invalid Username or Password");
        }
    }
}
