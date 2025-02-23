package com.javafxbankapp.structure;
import java.util.List;
import static com.javafxbankapp.Implement.AccountFileReader.readAccountsFromFile;
import static com.javafxbankapp.Implement.CustomerFileReader.readCustomersFromFile;

public class Account {
    private String username;
    private String password;
    public Account(String username, String password) {
    this.username = username;
    this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static Customer validateLogin(String username, String password) {
        String filePath = "src/main/java/com/javafxbankapp/Accounts.txt";
        List<Account> accounts = readAccountsFromFile(filePath);

        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                // Tìm customer tương ứng với username (phone)
                List<Customer> customers = readCustomersFromFile("src/main/java/com/javafxbankapp/Customers.txt");
                for (Customer customer : customers) {
                    if (customer.getPhone().equals(username)) {
                        return customer;
                    }
                }
            }
        }
        return null;
    }
}

