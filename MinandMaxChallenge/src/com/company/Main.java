package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, number, min = 0, max = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum numbers");
        n = scanner.nextInt();
        System.out.println("Enter number #1" );
        number = scanner.nextInt();
        min = number;
        max = number;
        for (i = 2; i < n+1 ; i++) {
            System.out.println("Enter number #" + i);
            number = scanner.nextInt();
            min = number;
            max = number;
            if (number < min) {
                max = number;
            }
            if (number > max) {
                min = number;
            }
        }
        System.out.println("The min and the max number is " + min + max);
    }
}