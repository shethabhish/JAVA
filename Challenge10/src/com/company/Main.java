package com.company;

public class Main {

    public static void main(String[] args) {
        Walls wall1 = new Walls("West");
	    Walls wall2 = new Walls("East");
        Walls wall3 = new Walls("North");
        Walls wall4 = new Walls("South");

        Celing celing = new Celing(10, "Blue");
        Bed bed = new Bed("King", 5, 3, 2);
        Bathroom bathroom = new Bathroom(10, "Blue", "American");
        Bedroom bedroom = new Bedroom(wall1,wall2,wall3,wall4,bathroom,bed,celing);

        bedroom.makebed();
    }
}
