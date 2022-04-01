package com.infogalaxy;

import java.util.Random;
import static java.lang.Math.*;

public class SnakeLadder {

    //UC-1- Player Start Game With Position 0;
    public void addPosition() {
        int position = 0;
        System.out.println("Player Position is" + position);
    }
    public void addDice(){
        Random random = new Random();
        int dice  = (int) ((Math.random()*(6-1))+1);
        System.out.println("Dice Number" + dice);
    }
    public static void main(String args[]){
        SnakeLadder dice = new SnakeLadder();
        dice.addPosition();
        dice.addDice();
    }

}

