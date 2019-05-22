package com.company;

public class Main {

    public static void main(String[] args) {
        Bankaccoount myaccount = new Bankaccoount(123456789l, 10000, "Shethabhish",
                "shethabhis@gmail.com", 8885161879l);
        myaccount.Deposit(10000);
        myaccount.Withdraw(5000);
        myaccount.Withdraw(5000);

        System.out.println(myaccount.getName());
        System.out.println(myaccount.getAcc());
        System.out.println(myaccount.getPhone());
        System.out.println(myaccount.getEmail());
    }
}
