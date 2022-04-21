package com.infogalaxy;

import java.util.Random;

public class SnakeLadder {
    //PLayer's Position
    int position = 0;


    //UC-1 Player's Game Start with Position 0:

    public void showPosition(int playerNo) {

        System.out.println("Player" + playerNo + " Position :" + position);
    }

    public void Diceroll(int playerNo) {

        Random random = new Random();
        //UC-2 Rolling Dice to Get Number between 1-6:
        int diceNo = (int) ((Math.random() * (7 - 1)) + 1);
        System.out.println("Dice Number:" + diceNo);

        int play = (int) ((Math.random() * (4 - 1)) + 1);
        //Player's Option to Playe Game:
        System.out.println(play);
        //UC-3 Checking PLayer's option to PLay:
        switch (play) {
            case Constants.NO_PLAY:
                position = position + diceNo;
                System.out.println("Stay on Same Position!");
                break;
            case Constants.LADDER:
                System.out.println("LADDER!!");
                position = position + diceNo;
                // In case Player go Above 100:
                if (position > 100) {
                    System.out.println("Player is Out of Board!!");
                    // PLayer Stays in Same Previous Position
                    position = position - diceNo;
                }
                break;
            case Constants.SNAKE:
                System.out.println("SNAKE!!!");
                position = position - diceNo;
                // Ensuring player's position not get below 0:
                if (position < 0) {
                    position = 0;
                }
                break;
        }
        showPosition(playerNo);
    }

    public static void main(String args[]) {
        //Creating Object:
        SnakeLadder Player_1 = new SnakeLadder();
        SnakeLadder Player_2 = new SnakeLadder();

        // Showing Player's Position
        System.out.println("Game Start Position:");
        Player_1.showPosition(1);
        Player_2.showPosition(2);
        // UC-7 Playing Game with 2 Players:
        while (Player_1.position != 100 && Player_2.position != 100) {
            System.out.println("Player 1 Chance:");
            Player_1.Diceroll(1);
            if (Player_1.position == 100){break;}
            System.out.println("Player 2 Chance");
            Player_2.Diceroll(2);
        }
        // Reporting Winner
        if (Player_1.position == 100){
            System.out.println("Player 1 is Winner!!!");
        }
        else {
            System.out.println("Player 2 is Winner!!!!");
        }

    }
}
