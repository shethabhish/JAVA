package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);


        System.out.println("Enter year of birth ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine();
            int age = 2019 - year;



            if (age >= 0 && age <= 100) {
                System.out.println("Your current age is : " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println(" Your name is " + name);
        }
        else {
            System.out.println("Cannot parse year of birth");
        }

        scanner.close();

    }
}
