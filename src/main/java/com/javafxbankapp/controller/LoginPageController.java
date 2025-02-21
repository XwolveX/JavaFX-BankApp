package com.javafxbankapp.controller;

import javafx.fxml.FXML;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class LoginPageController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button loginButton;
    @FXML
    public void loginButtonClicked(ActionEvent event) throws IOException {
    String Username = username.getText();
    String Password = password.getText();
    }
}
