package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2 ; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int count;
        int i;
        System.out.println("Enter the count");
        count = scanner.nextInt();
        int[] array = new int[count];
        for (i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        reverse(array);
        }
}
