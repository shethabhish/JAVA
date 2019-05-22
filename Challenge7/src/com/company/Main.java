package com.company;

public class Main {

    public static void main(String[] args) {
	char switchchar = 'F';

	switch (switchchar) {
        case 'A':
            System.out.println("A is the character");
            break;
        case 'B':
            System.out.println("B is the character");
            break;
        case 'C':
            System.out.println("C is the character");
            break;
        case 'D':
            System.out.println("D is the character");
            break;
        case 'E':
            System.out.println("E is the character");
            break;
            default:
                System.out.println("Characters are beyond E");
    }

    String mystring = "Feb";

	switch (mystring) {
        case "Jan" :
            System.out.println("Jan");
            break;
        case "Feb" :
            System.out.println("Feb");
            break;
            default:
                System.out.println("Not Jan or Feb");
                break;
    }
    }
}
