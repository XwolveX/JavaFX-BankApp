package com.javafxbankapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {

    @FXML
    private ScrollPane scrollPane;  // Scrollable container

    @FXML
    private AnchorPane anchorPane; // Content inside the ScrollPane

    @FXML
    private Label rankLabel; // Displays rank

    @FXML
    private Label nameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Ensure contentPane is taller than ScrollPane to allow scrolling
        anchorPane.setPrefHeight(1200);

        // Update labels with dynamic values
            nameLabel.setText("John Doe");
            rankLabel.setText("Gold Member");
    }
}
