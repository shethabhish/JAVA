package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("The score is 5000");
        } else if (score < 1000) {
            System.out.println("Less than 1000");
        } else {
            System.out.println("Got here");
      }

        if (gameOver) {
            int finalScore  = score + (levelCompleted * bonus);
            System.out.println(finalScore );
        }

    }
}
