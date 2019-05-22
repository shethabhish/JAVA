package com.company;

public class Deluxe extends Base {

    private double drinksprice;
    private double chipsprice;

    public Deluxe() {
        super("White bread","Chicken & Bacon", 199);
    }

    public void adddrinks(double price) {
        this.chipsprice = price;
    }
    public void addchips(double price) {
        this.drinksprice = price;
    }

    @Override
    public double TotalPrice() {
        double total = super.TotalPrice();
        if (this.chipsprice != 0) {
            total += this.chipsprice;
            System.out.println("Chips added and additional price is " +this.chipsprice);
        }
        if (this.drinksprice != 0) {
            total += this.drinksprice;
            System.out.println("Drinks added and additional price is " +this.drinksprice);
        }
        return total;

    }
}
