package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 123;
	int lastdigit=0 , sum, firstdigit = 0;

	lastdigit = number % 10;

    firstdigit = number;

        while (firstdigit >= 10) {
            firstdigit /= 10;
        }
    sum = firstdigit + lastdigit;
        System.out.println(sum);
    }
    }

