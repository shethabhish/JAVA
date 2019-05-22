package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            //System.out.println(count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println(count);
//            count++;
//
//            if (count > 10) {
//                break;
//            }
//        } while (count != 6);
        boolean value = isEvenNumber(8);
        System.out.println(value);
        value = isEvenNumber(9);
        System.out.println(value);
        value = isEvenNumber(-1);
        System.out.println(value );




    }

    public static boolean isEvenNumber ( int number) {
        if (number % 2 == 0 && number > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
