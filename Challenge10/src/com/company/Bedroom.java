package com.company;

public class Bedroom {

    private Walls wall1;
    private Walls wall2;
    private Walls wall3;
    private Walls wall4;
    private Bathroom bathrooms;
    private Bed bed;
    private Celing celing;

    public Bedroom(Walls wall1, Walls wall2, Walls wall3, Walls wall4, Bathroom bathrooms, Bed bed, Celing celing) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bathrooms = bathrooms;
        this.bed = bed;
        this.celing = celing;
    }

    public void makebed() {
        System.out.println("Make Bed");
        bed.make();
    }
}
