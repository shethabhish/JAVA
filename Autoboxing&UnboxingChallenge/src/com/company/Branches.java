package com.company;

import java.util.ArrayList;

public class Branches {

    private ArrayList<Customers> customers;
    private String name;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public void addnewCustomer(String name, double initialamount) {
        if (!this.customers.contains(name)) {
            this.customers.add(new Customers(name, initialamount));
        }
    }

    public void addTransaction(String name, double amount) {
        Customers exist = find(name);
        if (exist != null) {
            exist.addTransaction(amount);
        }
    }

    private Customers find(String name) {
        for (int i =0 ; i< this.customers.size(); i++) {
            Customers exist = this.customers.get(i);
            if (exist.getCustomerName().equals(name)) {
                return exist;
            }
        }
        return null;
    }

}
