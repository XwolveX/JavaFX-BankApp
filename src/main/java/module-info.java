module com.javafxbankapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.javafxbankapp to javafx.fxml;
    exports com.javafxbankapp;
}