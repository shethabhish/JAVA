package com.company;

import java.util.ArrayList;

public class Customers {

    private String CustomerName;
    private ArrayList<Double> transactions;

    public Customers(String customerName, double initialamount) {
        CustomerName = customerName;
        this.transactions = new ArrayList<>();
        addTransaction(initialamount);
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

}
