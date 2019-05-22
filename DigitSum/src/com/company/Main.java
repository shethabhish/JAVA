package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits = " + sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum += digit; // sum = sum + digit
            number /= 10; // number = number/10

        }
        return sum;
    }
}


