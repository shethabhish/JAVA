package com.company;

import java.util.ArrayList;

//class Intclass {
//    private int myint;
//
//    public Intclass(int myint) {
//        this.myint = myint;
//    }
//
//    public int getMyint() {
//        return myint;
//    }
//
//    public void setMyint(int myint) {
//        this.myint = myint;
//    }
//}

public class Main {

    public static void main(String[] args) {
//        ArrayList<Intclass> newint = new ArrayList<Intclass>();
//        newint.add(new Intclass(54));

//        ArrayList<Integer> intarraylist = new ArrayList<>();
//        for (int i = 0; i <= 10; i++) {
//            intarraylist.add(Integer.valueOf(i));
//        }
//        for (int i = 0; i <= 10; i++) {
//            System.out.println((i + 1) + " ----->" + intarraylist.get(i).intValue());
//        }

//        Integer integer = 54; //Converts into Integer.valueOf(54);
//        int value = integer; // integer.intValue();
//        Double mydouble = 54.54; //Converts into Double.valueOf(54.54);

        ArrayList<Double> mydouble = new ArrayList<>();
        for (double dbl = 0.0 ; dbl <=10.0; dbl+=0.5) {
//            mydouble.add(Double.valueOf(dbl)); // normal way
            mydouble.add(dbl); //shortcut way
        }
        for (int i = 0 ; i <mydouble.size(); i++) {
//            System.out.println(mydouble.get(i).doubleValue()); // normal way
            System.out.println(mydouble.get(i)); //shortcut way
        }
        }
}
