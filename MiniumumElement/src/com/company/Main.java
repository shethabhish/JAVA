package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        System.out.println("Enter " +count+ " numbers to find out the smallest number \r");
        int[] values = new int[count];
        for(int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findmin(int[] array) {
        int[] min = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        int small;
        while (flag) {
            flag = false;
            for (int i = 0; i < min.length - 1; i++) {
                if (min[i] > min[i + 1]) {
                    temp = min[i];
                    min[i] = min[i + 1];
                    min[i + 1] = temp;
                    flag = true;
                }
            }
        }
        small = min[0];
        return small;
    }

    public static void main(String[] args) {
        System.out.println("Enter the count");
        int count = scanner.nextInt();
        int[] numbers = readIntegers(count);
        System.out.println("The smallest number in the array is " +findmin(numbers));
    }
}
