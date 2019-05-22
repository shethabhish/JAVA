package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 23456;
        int sum = 0, evendigit;


        while (number > 0) {
            evendigit = number %10;
            if( evendigit % 2 == 0) {
                sum += evendigit;
            }
            number /= 10;

        }
        System.out.println(sum);

    }
}
