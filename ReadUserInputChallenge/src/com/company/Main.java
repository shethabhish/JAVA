package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sum = 0, i,numbers;
	for (i=1; i<=10; i++) {
        System.out.println("Enter number #" +i);
        boolean checkint = scanner.hasNextInt();
        if (checkint == false) {
            System.out.println("Enter all numbers");
            break;
        }
        else {
            numbers = scanner.nextInt();
            sum += numbers;
        }
    }
        System.out.println("The sum of the numbers :" +sum);
	scanner.close();
    }
}
