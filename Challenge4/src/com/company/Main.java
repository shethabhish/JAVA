package com.company;

public class Main {

    public static void main(String[] args) {
        boolean newGame = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (newGame) {
            int finalgame = score * levelCompleted * bonus;
            System.out.println(finalgame);
        }
    }
}
