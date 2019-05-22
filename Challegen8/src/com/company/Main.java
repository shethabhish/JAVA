package com.company;

public class Main {

    public static void main(String[] args) {
	VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Barry", 9999);
        System.out.println(person2.getLimit());

        VipCustomer person3 = new VipCustomer("Allen", 2602, "allen@flash.com");
        System.out.println(person3.getEmail());
    }
}
