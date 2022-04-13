package com.infogalaxy;

import java.util.Random;

import static java.lang.Math.*;

public class SnakeLadder {
    //PLayer's Position
    int position = 0;


    //UC-1 Player's Game Start with Position 0:

    public void showPosition() {

        System.out.println("Player Position is " + position);
    }
    public void Diceroll() {
        //UC-5 Ensuring Player get Exact Winning position 100 :
        while (position != 100 ) {
            Random random = new Random();
            //UC-2 Rolling Dice to Get Number between 1-6:
            int diceNo = (int) ((Math.random() * (7 - 1)) + 1);
            System.out.println("Dice Number:" + diceNo);

            int play = (int)((Math.random() * (4-1)) + 1);
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
                    if (position>100) {
                        System.out.println("Player is Out of Board!!");
                        // PLayer Stays in Same Previous Position
                        position = position - diceNo;
                    }
                    break;
                case Constants.SNAKE:
                    System.out.println("SNAKE!!!");
                    position = position - diceNo;
                    // Ensuring player's position not get below 0:
                    if(position<0){
                        position = 0;
                    }
                    break;
            }
            showPosition();
        }
    }


    public static void main(String args[]) {
        //Creating Object:
        SnakeLadder Player_1 = new SnakeLadder();
        //Calling Function through Object:
        Player_1.showPosition();
        Player_1.Diceroll();
        Player_1.showPosition();

    }

}