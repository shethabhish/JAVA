package com.company;

public class Main {

    public static void main(String[] args) {
//	Player player = new Player();
//	player.name = "Shethabhish";
//	player.health = 20;
//	player.weapon = "Sword";
//
//	//int damage = 10;
//	player.losehealth(10);
//	System.out.println(player.healthremaining());
//
//	//damage = 11;
//	player.health = 100;
//	player.losehealth(11);
//	System.out.println(player.healthremaining());

	EnhancedPlayer player = new EnhancedPlayer("Shethabhish", 200, "Sword");
		System.out.println(player.getHealth());
    }
}
