package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50,false);
        System.out.println(printer.getPagesprinted());
        printer.Print(4);
        System.out.println(printer.getPagesprinted());
        printer.Print(2);
        System.out.println(printer.getPagesprinted());
    }
}
