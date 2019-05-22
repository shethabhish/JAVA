package com.company;

public class Main {

    public static void main(String[] args) {
        MbConvertor(2048);
        MbConvertor(2056);
        MbConvertor(0);
        MbConvertor(-10);
    }

    public static void MbConvertor (int kb) {
        if (kb < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int mb = (kb/1024);
            int kilo = (kb % 1024);
            System.out.println(kb + "KB = " + mb + "MB and " + kilo + "KB");
        }
     }
}
