package com.company;

public class Main {

    public static void main(String[] args) {
	 double myValue1 = 20d;
	 double myValue2 = 80d;
	 double sum = (myValue1 + myValue2)*25d;
        System.out.println(sum);

        double remainder = sum % 40d;
        System.out.println(remainder);

        if ((remainder<=20d))
            System.out.println("Total was over limit");
    }
}
