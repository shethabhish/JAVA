 package com.company;

        public class Main {

            public static void main(String[] args) {
                boolean gameOver = true;
                int score = 800;
                int levelCompleted = 5;
                int bonus = 100;

                int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
                System.out.println(highscore);

                score = 10000;
                levelCompleted = 8;
                bonus = 200;

                highscore = calculateScore(gameOver, score, levelCompleted, bonus);
                System.out.println(highscore);

                int high = calculateHighScorePosition(1001);
                displayHighScorePosition("Shethabhish" , high);

                high = calculateHighScorePosition(999);
                displayHighScorePosition("Kyrie" , high);

                high = calculateHighScorePosition(499);
                displayHighScorePosition("LeBron" , high);

                high = calculateHighScorePosition(99);
                displayHighScorePosition("Westbrook" , high);


    }
    public static void displayHighScorePosition (String playername, int position) {
        System.out.println(playername);
        System.out.println(position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }
            return 4;
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

                if (gameOver) {
                    int finalScore = score + (levelCompleted * bonus);
                    finalScore += 2000;
                    return finalScore;
                }
                return -1;

            }


        }


