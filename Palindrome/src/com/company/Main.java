package com.company;

public class Main {

    public static void main(String[] args) {
    	int number = 525;
		int temp, digit;
		temp = number;
		int sum = 0;

		while (temp >0) {

	    digit = temp%10;
	    sum = (sum*10) + digit;
	    temp/= 10;
    }
	if (number == sum) {
        System.out.println("Palindrome");
    }
	else
        System.out.println("Not a Palindrome");
    }
}
