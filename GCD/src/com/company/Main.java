package com.company;

public class Main {

    public static void main(String[] args) {
        int n1 = 81, n2 = 153, gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
    }
}
