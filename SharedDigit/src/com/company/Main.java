package com.company;

public class Main {

    public static void main(String[] args) {
        boolean value = share(12,23);
        System.out.println(value);
        value = share(98, 65);
        System.out.println(value);

    }
    public static boolean share (int a, int b) {
            int lefta = a / 10;
            int righta = a % 10;
            int leftb = b / 10;
            int rightb = b % 10;
            if (lefta == leftb || righta == rightb || lefta == rightb || leftb == righta) {
                return true;
            }
            else
            return false;
    }
}
