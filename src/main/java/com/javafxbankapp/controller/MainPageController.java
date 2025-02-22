package com.javafxbankapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MainPageController {

    @FXML
    private void handleDeposit() {
        showAlert("Nạp tiền", "Chức năng nạp tiền đang được phát triển.");
    }

    @FXML
    private void handleWithdraw() {
        showAlert("Rút tiền", "Chức năng rút tiền đang được phát triển.");
    }

    @FXML
    private void handleTransfer() {
        showAlert("Chuyển khoản", "Chức năng chuyển khoản đang được phát triển.");
    }

    @FXML
    private void handleTransactionHistory() {
        showAlert("Lịch sử giao dịch", "Chức năng lịch sử giao dịch đang được phát triển.");
    }

    @FXML
    private void handleLogout() {
        showAlert("Đăng xuất", "Bạn đã đăng xuất thành công.");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
