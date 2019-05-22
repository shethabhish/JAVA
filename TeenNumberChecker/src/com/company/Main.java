package com.company;

public class Main {

    public static void main(String[] args) {
        boolean ans = TeenChecker(13);
        System.out.println(ans);
        ans = TeenChecker(20);
        System.out.println(ans);
        ans = TeenChecker(0);
        System.out.println(ans);
        ans = TeenChecker(-15);
        System.out.println(ans);
    }

    public static boolean TeenChecker(int teen) {
        if (teen>12 && teen <20) {
            return true;
        }
        else {
            return false;
        }
    }
}
