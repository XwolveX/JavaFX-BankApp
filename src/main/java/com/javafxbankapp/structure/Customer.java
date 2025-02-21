package com.javafxbankapp.structure;

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
        this.rank = rank;
        this.address = address;
    }
    //method get phone number
    public String getUsername() {
        return username;
    }
    //method get balance
    public String getBalance() {
        return balance.toString();
    }

}
