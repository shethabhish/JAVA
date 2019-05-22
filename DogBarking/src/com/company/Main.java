package com.company;

public class Main {

    public static void main(String[] args) {
        boolean ans = Bark(1);
        System.out.println(ans);
        ans= Bark(2);
        System.out.println(ans);
        ans = Bark(8);
        System.out.println(ans);
        ans = Bark(-1);
        System.out.println(ans);
        ans = Bark(23);
        System.out.println(ans);
    }

    public static boolean Bark(int range) {
        if( range >= 8 && range <= 22) {
            return false;
        }
        else if (range > 23){
            return false;
        }
        else if (range <0){
            return false;
        }
        else {
            return true;
        }
    }
}
