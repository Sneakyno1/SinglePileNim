package com.company;

import java.util.Scanner;

class SinglePileNimStandard {

    public int singlePileSize = 12; // used to represent the size of the pile
    public int turnCounter = 0;  // counts the number of turns


    public void PlayerTurn(){
        turnCounter++;
        Scanner playerInput= new Scanner(System.in);
        boolean validInput = false;
        int i;

        while   (!validInput) { // gets input from user, validates that its what we want, and makes the change
            System.out.println("Enter the number of tiles to take (1, 2, or 3): ");
            i = playerInput.nextInt();

            if ( i > singlePileSize || i < 1 || i > 3) {

                System.out.println("Invalid input, please try again");

            }

            else{

                singlePileSize -= i;
                validInput= true;
            }
        }
        PrintPile();

    } // game logic for the players turn

    public void AITurn(){
        turnCounter++;
        int amountTaken = singlePileSize%4;
        singlePileSize -= amountTaken;
        System.out.print("AI took "+amountTaken+ " tiles \n");
        PrintPile();
    } //handles the games ai for the simplest version of single pile nim

    public void PrintPile(){
        for (int i = singlePileSize; i>0; i--){
            System.out.print('X');
        }
        System.out.println(" " + singlePileSize + " tiles left");
        System.out.print('\n');
    } //Prints the size of the pile in characters of 'X'

    public  int SizeofPile(){
        return singlePileSize;
    } // returns the size of the pile

    public  int TurnNumber(){
        return turnCounter;
    } // returns the current turn number
}
