package com.javafxbankapp.Implement;

import com.javafxbankapp.structure.Account;
import com.javafxbankapp.structure.Customer;

import java.io.*;
import java.util.*;

public class AccountFileReader {
    public static List<Account> readAccountsFromFile(String filePath) {
        List<Account> accounts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Account account = new Account(data[0], data[1]);
                accounts.add(account);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return accounts;
    }
    public static void writeAccountsToFile(String filePath, List<Account> accounts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Account account : accounts) {
                bw.write(String.join(",",
                        account.getPassword(),
                        account.getPassword()
                ));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
