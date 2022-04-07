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
        //UC-2 Rolling Dice to Get Number between 1-6:

        Random random = new Random();
        int diceNo = (int) ((Math.random() * (6 - 1)) + 1);
        System.out.println("Dice Number:" + diceNo);
        //UC-3 Checking PLayer's option to PLay:
        int play = random.nextInt() % 3;
        //Player's Option to Playe Game:
        System.out.println(play);
        switch (play)
        {
            case Constants.NO_PLAY:
                position = position + diceNo;
                System.out.println("Stay on Same Position!");
                break;
            case Constants.LADDER:
                System.out.println("LADDER!!");
                position = position + diceNo;
                break;
            case Constants.SNAKE:
                System.out.println("SNAKE!!!");
                position = position - diceNo;
                break;
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
