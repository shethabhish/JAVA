package com.company;

public class Base {

    private String breadroll;
    private String meat;
    private double price;

    private double price1;
    private double price2;
    private double price3;
    private double price4;


    public Base(String breadroll, String meat, double price) {
        this.breadroll = breadroll;
        this.meat = meat;
        this.price = price;
    }

    public void addlettuce(double price) {
        this.price1 = price;
    }
    public void addtomato(double price) {
        this.price2 = price;
    }
    public void addcarrot (double price) {
        this.price3 = price;
    }
    public void addcabbage(double price) {
        this.price4 = price;
    }

    public double TotalPrice() {
        double total = this.price;
        System.out.println(breadroll + " Hamburger with " +meat+ " costs " +this.price);
        if (this.price1 != 0) {
            total += this.price1;
            System.out.println("Lettuce added and additional price is " +this.price1);
        }
        if (this.price2 != 0) {
            total += this.price2;
            System.out.println("Tomato added and additional price is " +this.price2);
        }
        if (this.price3 != 0) {
            total += this.price3;
            System.out.println("Carrot added and additional price is " +this.price3);
        }
        if (this.price4 != 0) {
            total += this.price4;
            System.out.println("Cabbage added and additional price is " +this.price4);
        }
        return total;
    }
}
