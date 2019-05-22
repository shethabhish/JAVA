package com.company;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " +number+ " numbers.\r");
        int[] values = new int[number];
        for(int i = 0 ; i< values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum =0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return (double) (sum)/ (double) (array.length);
    }


    public static void main(String[] args) {
        int[] myIntarray = getIntegers(5);
        for (int i =0 ;i<myIntarray.length; i++) {
            System.out.println("Elements are " +myIntarray[i]);
        }
        System.out.println("Average of the elements are " +getAverage(myIntarray));


//        int[] myIntarray = new int[10];
//        int[] myIntarray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] myIntarray2 = new int[10];
//        myIntarray[5] = 10;
////    double[] myDoublearray = new double[10];
//        System.out.println(myIntarray[5]);
//        System.out.println(myIntarray1[5]);
//        for (int i = 0; i < myIntarray2.length; i++) {
//            myIntarray2[i] = i * 10;
//        }
//        Printarray(myIntarray2);
//    }

//    public static void Printarray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }
}
