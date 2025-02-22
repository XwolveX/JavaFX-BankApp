package com.javafxbankapp.structure;

import java.util.List;

import static com.javafxbankapp.Implement.CustomerFileReader.readCustomersFromFile;

public class Customer {
    private String username; //it's Phone Number
    private String password;
    private String name;
    private Float  balance;
    private Integer age;
    private String email;
    private String rank;
    private String address;
    public Customer(String username, String password, String name, Float balance, Integer age, String email, String rank, String address) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.age = age;
        this.email = email;
        this.rank = "bronze";
        this.address = address;
    }
    //method get phone number
    public String getUsername() {
        return username;
    }
    //method get password
    public String getPassword() {
        return password;
    }
    //method get balance
    public String getBalance() {
        return balance.toString();
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getRank() {
        return rank;
    }
    public String getAddress() {
        return address;
    }
    public static Customer validateLogin(String username, String password) {
        String filePath = "src/main/java/com/javafxbankapp/customers.txt";
        List<Customer> customers = readCustomersFromFile(filePath);
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                return customer;
            }
        }
        return null;
    }
}
