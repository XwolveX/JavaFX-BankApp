package com.javafxbankapp.controller;
import com.javafxbankapp.structure.Customer;
import com.javafxbankapp.Implement.SessionManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController {
    @FXML
    private BorderPane mainPagePane;
    @FXML
    private HBox hBoxId;
    @FXML
    private Label bankNameId;
    @FXML
    private Region hBoxRegionId;
    @FXML
    private Button logoutButtonId;
    @FXML
    private VBox vBox1Id;
    @FXML
    private Button dashboardButtonId;
    @FXML
    private Button accountButtonId;
    @FXML
    private Button transferButtonId;
    @FXML
    private Button paymentButtonId;
    @FXML
    private Button cardButtonId;
    @FXML
    private Button settingsButtonId;
    @FXML
    private StackPane stackPaneId;
    @FXML
    private VBox vBox2Id ;
    @FXML
    private Label customerNameId;
}
