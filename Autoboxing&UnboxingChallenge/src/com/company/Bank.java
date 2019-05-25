package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankname;
    private ArrayList<Branches> branches;

    public Bank(String bankname) {
        this.bankname = bankname;
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchname) {
        if (!this.branches.contains(branchname)) {
            this.branches.add(new Branches(branchname));
            System.out.println("New Branch added");
            System.out.println("Name: " +branchname);
        }
        else {
            System.out.println("Branch already exists");
        }
    }

    public void addCustomer(String branchname, String customername, double initialtransaction) {
        Branches branch = find(branchname);
        if (branch != null) {
            branch.addnewCustomer(customername, initialtransaction);
            System.out.println("New customer added to the branch: " +branchname);
            System.out.println("Name: " +customername+ " Balance: " +initialtransaction);
//            return initialtransaction;
        }
        else {
            System.out.println("Branch does'nt exists");
//            return 0;
        }
    }

    public void addTransaction(String branchname, String customername, double amount) {
        Branches exist = find(branchname);
        if (exist != null) {
            exist.addTransaction(customername, amount);
            System.out.println("Transaction successful");
//            double balance = addCustomer(branchname, customername, i);
            System.out.println("Name: " +customername+ " Updated Balance: " +amount);
        }
        else {
            System.out.println("Branch does'nt exists");
        }
    }


    private Branches find(String branchname) {
        for (int i =0 ; i<branches.size(); i++) {
           Branches exist = this.branches.get(i);
           if (exist.getName().equals(branchname)) {
               return exist;
           }
        }
        return null;
    }
}
