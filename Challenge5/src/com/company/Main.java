package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition();
        int score = calculateHighScorePosition();
        System.out.println(score);
        public static void displayHighScorePosition(String playerName, int position) {
            System.out.println(playerName);
            System.out.println(position);
        }
        public static int calculateHighScorePosition(int playerScore) {
            return playerScore;
        }
         //return -1;
    }
}
