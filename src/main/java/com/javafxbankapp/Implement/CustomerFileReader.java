package com.javafxbankapp.Implement;

import com.javafxbankapp.structure.Customer;

import java.io.*;
import java.util.*;

public class CustomerFileReader {
    public static List<Customer> readCustomersFromFile(String filePath) {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 8) {
                    Customer customer = new Customer(
                            data[0], // username (Phone Number)
                            data[1], // password
                            data[2], // name
                            Float.parseFloat(data[3]), // balance
                            Integer.parseInt(data[4]), // age
                            data[5], // email
                            data[6], // rank
                            data[7]  // address
                    );
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return customers;
    }

    public static void writeCustomersToFile(String filePath, List<Customer> customers) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Customer customer : customers) {
                bw.write(String.join(",",
                        customer.getUsername(),
                        customer.getPassword(),
                        customer.getName(),
                        customer.getBalance(),
                        customer.getAge().toString(),
                        customer.getEmail(),
                        customer.getRank(),
                        customer.getAddress()
                ));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}

