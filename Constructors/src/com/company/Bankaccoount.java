package com.company;

public class Bankaccoount {
    private long Acc;
    private int balance;
    private String name;
    private String Email;
    private long Phone;

    public Bankaccoount(long Acc, int balance, String name, String Email,  long Phone) {
        System.out.println("Account parameters updated");
        this.Acc = Acc;
        this.balance = balance;
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
    }

    public void Deposit(int money) {
        this.balance += money;
        System.out.println("Deposited amount is " + money + " updated balance is " + this.balance);
    }

    public void Withdraw(int amount) {
        if (this.balance - amount <= 0) {
            System.out.println("Amount cannot be withdrawn");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdrawed amount is " + amount + " updated balance is " + this.balance);
        }
    }

    public long getAcc() {
        return Acc;
    }

    public void setAcc(long acc) {
        Acc = acc;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long phone) {
        Phone = phone;
    }

}
