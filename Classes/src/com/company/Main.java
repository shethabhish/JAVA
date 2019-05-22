package com.company;

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car(); // new class
	Car mustang = new Car();

	porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());  // output
    }

}
