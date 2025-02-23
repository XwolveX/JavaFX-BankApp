package com.javafxbankapp.structure;

import java.util.List;

import static com.javafxbankapp.Implement.CustomerFileReader.readCustomersFromFile;

public class Customer {
    private String name;
    private String phone;
    private Float  balance;
    private Integer age;
    private String email;
    private String rank;
    private String address;
    public Customer(String phone, String name, Float balance, Integer age, String email, String rank, String address) {
        this.phone = phone;
        this.name = name;
        this.balance = balance;
        this.age = age;
        this.email = email;
        this.rank = "bronze";
        this.address = address;
    }
    public String getPhone() {return phone;}
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

}
