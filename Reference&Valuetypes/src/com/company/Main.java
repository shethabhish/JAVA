package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        b++;

        System.out.println(a);
        System.out.println(b);

        int[] arr1 = new int[5]; // using new means referencing
        int[] arr2 = arr1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2[0] = 1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2 = new int[] {5,4,3,2,1};
        modify(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void modify(int[] array) {
        array[0] = 2; // this is referencing
        array =new int[] {1,2,3,4}; // this is dereferencing
    }
}
