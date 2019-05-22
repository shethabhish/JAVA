package com.company;

public class Main {

    public static void main(String[] args) {
	int score1 = CalculateScore("Shethabhish",100);
        System.out.println(score1);
        int score2 = CalculateScore(200);
        System.out.println(score2);
        CalculateScore();
    }
    public static int CalculateScore(String playername, int score) {
        System.out.println("The player name is " + playername + "and he scored " + score);
        return score*1000;
    }
    public static int CalculateScore(int score) {
        System.out.println("Unnamed player scored " + score);
        return score*1000;
    }
    public static int CalculateScore() {
        System.out.println("Unnamed player scored " + score);
        return 0;
    }
}
