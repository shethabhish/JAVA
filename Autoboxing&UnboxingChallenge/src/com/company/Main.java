package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        bank.addBranch("Hyd");
        System.out.println("Branch Hyd created");
        bank.addCustomer("Hyd", "Barry", 3000);
        bank.addBranch("Del");
        bank.addCustomer("Del", "Allen", 3000);
        bank.addCustomer("Hyd", "Flash", 10000);
        bank.addCustomer("Del", "Arrow", 20000);
        bank.addTransaction("Hyd","Barry", 7000);


    }
}
