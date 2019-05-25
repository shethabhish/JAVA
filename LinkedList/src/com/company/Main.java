package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Barry", 1000);
        Customer customer1 = customer;
        customer1.setBalance(2000);
        System.out.println(customer.getName()+ " " +customer.getBalance()) ;

        ArrayList<Integer> intlist = new ArrayList<>();

        intlist.add(1);
        intlist.add(3);
        intlist.add(4);

        for (int i =0 ; i<intlist.size();i++) {
            System.out.println(i +" ------> "+intlist.get(i));
        }

        intlist.add(1,2);

        for (int i =0 ; i<intlist.size();i++) {
            System.out.println(i +" ------> "+intlist.get(i));
        }

        intlist.remove(0);

        for (int i =0 ; i<intlist.size();i++) {
            System.out.println(i +" ------> "+intlist.get(i));
        }
    }
}
