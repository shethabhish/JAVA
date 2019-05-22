package com.company;

public class Main {

    public static void main(String[] args) {

        byte mybyte = 10;
        short myshort = 31000;
        int myint = 11;
        long mylongtotal = 50000L + 10L*(mybyte+myint+myshort);
        short shorttotal = (short) (10 + 20*(mybyte+myshort+myint));
        System.out.println(mylongtotal);
        System.out.println(shorttotal);
    }
}
