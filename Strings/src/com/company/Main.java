package com.company;

public class Main {

    public static void main(String[] args) {
        String mystring = " My name is Barry Allen";
        System.out.println(mystring);
        mystring = mystring + ",and I'm the fastest man alive";
        System.out.println(mystring);
        mystring = mystring + " \u00A9";
        System.out.println(mystring);

        String mynum = "26.02";
        mynum = mynum + ".1998";
        System.out.println(mynum);

        String newnum = "100";
        int myint = 200;
        newnum = newnum + myint;
        System.out.println(newnum);
    }
}
