module com.javafxbankapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.javafxbankapp to javafx.fxml;
    exports com.javafxbankapp;
    exports com.javafxbankapp.controller;
    opens com.javafxbankapp.controller to javafx.fxml;
}