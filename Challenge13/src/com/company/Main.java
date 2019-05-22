package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " +number+ " numbers \r");
        int[] values = new int[number];
        for (int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] print) {
        for(int i =0 ; i<print.length;i++) {
            System.out.println(print[i]);
        }
    }

    public static int[] sort(int[] array) {
        int[] sortedarray = new int[array.length];
        int temp;
        for(int i=0; i<array.length; i++) {
            sortedarray[i] = array[i];
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedarray.length - 1; i++) {
                if (sortedarray[i] < sortedarray[i + 1]) {
                    temp = sortedarray[i];
                    sortedarray[i] = sortedarray[i + 1];
                    sortedarray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedarray;
    }

    public static void main(String[] args) {
	int[] array1 = getIntegers(5);
	int[] sorted = sort(array1);
	printArray(sorted);


    }
}
