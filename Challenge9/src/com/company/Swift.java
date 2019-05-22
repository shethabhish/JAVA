package com.company;

public class Swift extends Car {

    private int service;

    public Swift(int service) {
        super("Swift", "4WD", 4, 4, 5, true);
        this.service = service;
    }

    public void accelerate (int rate) {
        int newvelocity = getSpeed() + rate;
        if (newvelocity == 0) {
            Stop();
            Changegear(1);
        } else if (newvelocity >0 && newvelocity <=10) {
            Changegear(1);
        } else if (newvelocity > 10 && newvelocity <=30) {
            Changegear(2);
        } else if (newvelocity > 30 && newvelocity <=50) {
            Changegear(3);
        } else if (newvelocity > 50 && newvelocity <=80) {
            Changegear(4);
        } else {
            Changegear(5);
        }

        if (newvelocity > 0) {
            changeVelocity(newvelocity,getDirection());

        }

    }
}
