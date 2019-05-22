package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentgear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentgear = 1;
    }

    public void Changegear(int currentgear) {
        this.currentgear = currentgear;
        System.out.println("Current gear is " +this.currentgear);
    }

    public void changeVelocity(int velocity, int dir) {
        Move(velocity, dir);
        System.out.println("Velocity changed to " +velocity+ " and direction to " +dir);
    }


}
