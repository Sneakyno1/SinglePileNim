package com.company;

import java.util.Scanner;
import java.util.Random;

public class SinglePileNimLazy extends SinglePileNimStandard{



    public void AITurn(){
        Random rand = new Random();
        turnCounter++;
        int amountTaken= rand.nextInt(4);
        if (amountTaken==0){
            amountTaken++;
        }
        singlePileSize -= amountTaken;
        System.out.print("AI took "+amountTaken+ " tiles \n");
        PrintPile();
    } //handles the games ai for the simplest version of single pile nim
}
