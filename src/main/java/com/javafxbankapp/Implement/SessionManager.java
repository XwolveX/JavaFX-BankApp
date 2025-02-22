package com.javafxbankapp.Implement;

import com.javafxbankapp.structure.Customer;

public class SessionManager {
    private static Customer loggedInCustomer;

    public static void setCustomer(Customer customer) {
        loggedInCustomer = customer;
    }

    public static Customer getCustomer() {
        return loggedInCustomer;
    }

    public static String getCustomerName() {
        return (loggedInCustomer != null) ? loggedInCustomer.getName() : "Guest";
    }
}
