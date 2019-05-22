package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int enginecapacity;

    public Car(String name, int wheels, int enginecapacity) {
        super(name);
        this.wheels = wheels;
        this.enginecapacity = enginecapacity;
    }
}
