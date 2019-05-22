package com.company;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void losehealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player dead");
        }
    }

    public int healthremaining() {
        return this.health;
    }
}
