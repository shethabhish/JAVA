package com.company;

public class Healthy extends Base {

    private double price5;
    private double price6;

    public Healthy() {
        super("Brown rye", "Chicken", 149);
    }

    public void addCucumber(double price) {
        this.price5 = price;
    }

    public void addBroccoli(double price) {
        this.price6 = price;
    }

    @Override
    public double TotalPrice() {
        double total = super.TotalPrice();
        if (this.price5 != 0) {
            total += this.price5;
            System.out.println("Cucumber added and additional price is " +this.price5);
        }
        if (this.price6 != 0) {
            total += this.price6;
            System.out.println("Broccoli added and additional price is " +this.price6);
        }
        return total;
    }
}
