package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int speed;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.speed = 0;
        this.direction = 0;
    }

    public void Steer(int dir) {
        this.direction = dir;
        System.out.println(" Steer() called: steering at :" +direction);
    }
    public void Move (int velocity, int dir) {
        speed = velocity;
        direction = dir;
        System.out.println("The vehicle is moving at speed of " + speed+  " and at direction of " +direction);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void Stop() {
        this.speed = 0;
    }
}
