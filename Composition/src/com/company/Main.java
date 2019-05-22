package com.company;

public class Main {

    public static void main(String[] args) {
	Dimensions dimensions = new Dimensions(30 ,20, 5);
	Case thecase = new Case("Vostro", "Dell", "240", dimensions);
	Monitor monitor = new Monitor("1500", "Dell", 15, new Resolution(20,15));
	Motherboard motherboard = new Motherboard("99","Dell", 2, 2, "V2.0" );
	PC thePC = new PC(thecase,monitor,motherboard);
	thePC.Powerup();
    }
}
