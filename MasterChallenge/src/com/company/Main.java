package com.company;

public class Main {

    public static void main(String[] args) {
	Base base = new Base("Brown Bread", "Chicken",99);
	base.addlettuce(10);
	base.addcabbage(10);
	base.addcarrot(15);
	base.addtomato(10);
	System.out.println("The total price is " +base.TotalPrice() +"\n");

	Healthy healthy =new Healthy();
	healthy.addCucumber(15);
	healthy.addBroccoli(20);
	System.out.println("The total price is " +healthy.TotalPrice() +"\n");

	Deluxe deluxe = new Deluxe();
	deluxe.addchips(15);
	deluxe.adddrinks(25);
	System.out.println("The total price is " +deluxe.TotalPrice());

    }
}
