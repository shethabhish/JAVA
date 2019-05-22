package com.company;

public class Main {

    public static void main(String[] args) {
	int i;
	for (i=8;i>1;i--) {
        System.out.println("10,000 at interest of " + i + "% is equal to " + String.format("%.2f", CalculateInterest(10000,i)));
    }
    }
    public static double CalculateInterest (double amount, double interest) {

        return (amount*(interest/100));

}
}
