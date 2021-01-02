/*
* Author: Andrew Ingles
* creation date: 12/27/2020
* last modification date: 1/2/2020
*
* The purpose if this program is to make a single pile nim game in the command line with java
* TODO: refine classes to improve polymorphism (done once, can be done more as time goes on)
* TODO: add more game types for single pile nim
* TODO: add a rules page to explain the rules of the games
* TODO: add a tutorial/tutorials?
*
* */

package com.company;
import java.util.Scanner;
import java.util.Random;


// Main will contain the main menu with the main game loop

public class Main {
    static void GL_SPNStandard(){
        SinglePileNimStandard GameState = new SinglePileNimStandard();
        GameState.PrintPile();

        while (GameState.SizeofPile() != 0){ // this while loop keeps the game going until there are no tiles left
            GameState.PlayerTurn();
            GameState.AITurn();

        }

        if (GameState.TurnNumber()%2==0){  // using mod for this comparison because ending on an even turn means the bot
            System.out.println("AI Wins"); // was the last one to take the tile which means the bot wins, its the other
            // way for odd turns
        }

        else {
            System.out.println("You Win!");// we only get here by ending on an odd turn due to the previous if statement
        }

    } // function called to play standard single pile nim

    static void GL_SPNLazy(){
        SinglePileNimLazy GameState = new SinglePileNimLazy();
        GameState.PrintPile();

        while (GameState.SizeofPile() > 0){ // this while loop keeps the game going until there are no tiles left
            if (GameState.TurnNumber()%2==0){
                GameState.PlayerTurn();
            }
            else {
                GameState.AITurn();
            }
        }

        if (GameState.TurnNumber()%2==0){  // using mod for this comparison because ending on an even turn means the bot
            System.out.println("AI Wins"); // was the last one to take the tile which means the bot wins, its the other
            // way for odd turns
        }

        else {
            System.out.println("You Win!");// we only get here by ending on an odd turn due to the previous if statement
        }

    }

    static void GL_SPNArbitraryPileSize(){
        SinglePileNimArbitraryPileSize GameState = new SinglePileNimArbitraryPileSize();
        Scanner playerInput= new Scanner(System.in);
        boolean validInput = false;
        int i;

        while   (!validInput) {
            System.out.println("Enter the number of tiles to put in the pile");
            i = playerInput.nextInt();

            if (i < 1) {

                System.out.println("Invalid input, please try again");

            }

            else{

                GameState.PileSizeSetter(i);
                validInput= true;
            }
        }

        GameState.PrintPile();

        while (GameState.SizeofPile() > 0){ // this while loop keeps the game going until there are no tiles left
            if (GameState.TurnNumber()%2==0){
                GameState.PlayerTurn();
            }
            else {
                GameState.AITurn();
            }
        }

        if (GameState.TurnNumber()%2==0){  // using mod for this comparison because ending on an even turn means the bot
            System.out.println("AI Wins"); // was the last one to take the tile which means the bot wins, its the other
            // way for odd turns
        }

        else {
            System.out.println("You Win!");// we only get here by ending on an odd turn due to the previous if statement
        }

    }

    static void GL_SPNRandomTurn(){
        SinglePileNimArbitraryPileSize GameState = new SinglePileNimArbitraryPileSize();
        Random rand = new Random();
        int randInt = 0;
        GameState.PrintPile();

        while (GameState.SizeofPile() > 0){ // this while loop keeps the game going until there are no tiles left
            randInt = rand.nextInt(2);

            if (randInt == 1){
                GameState.PlayerTurn();
            }

            else{
                GameState.AITurn();
            }
        }

        if (GameState.TurnNumber()%2==0){  // using mod for this comparison because ending on an even turn means the bot
            System.out.println("AI Wins"); // was the last one to take the tile which means the bot wins, its the other
            // way for odd turns
        }

        else {
            System.out.println("You Win!");// we only get here by ending on an odd turn due to the previous if statement
        }

    }

    static void GL_SPNMultiplayer(){
        SinglePileNimArbitraryPileSize GameState = new SinglePileNimArbitraryPileSize();
        Scanner playerInput= new Scanner(System.in);
        boolean validInput = false;
        int i;

        while   (!validInput) {
            System.out.println("Enter the number of tiles to put in the pile");
            i = playerInput.nextInt();

            if (i < 1) {

                System.out.println("Invalid input, please try again");

            }

            else{

                GameState.PileSizeSetter(i);
                validInput= true;
            }
        }

        GameState.PrintPile();

        while (GameState.SizeofPile() > 0){ // this while loop keeps the game going until there are no tiles left
            if (GameState.TurnNumber()%2==0){
                System.out.println("Player 1's turn");
                GameState.PlayerTurn();
            }
            else {
                System.out.println("Player 2's turn");
                GameState.PlayerTurn();
            }
        }

        if (GameState.TurnNumber()%2==0){  // using mod for this comparison because ending on an even turn means the bot
            System.out.println("Player 2 Wins!"); // was the last one to take the tile which means the bot wins, its the other
            // way for odd turns
        }

        else {
            System.out.println("Player 1 Wins!");// we only get here by ending on an odd turn due to the previous if statement
        }

    }

    static void RuleMenu(){
        Rules ruleList = new Rules();
        Scanner mainScanner = new Scanner(System.in);
        boolean done = false;
        System.out.println(" ");
        System.out.println("This menu contains the rules for each version of Nim in the collection");
        System.out.println("Please select an option from the choices below by typing in the corresponding number");

        while (!done){
            System.out.println(" ");
            System.out.println("Rules Menu:");
            System.out.println("1. Standard Single Pile Nim");
            System.out.println("2. Lazy Single Pile Nim");
            System.out.println("3. Arbitrary Pile Size Single Pile Nim");
            System.out.println("4. Random turn Single Pile Nim");
            System.out.println("5. Multiplayer Single Pile Nim");
            System.out.println("0. Return to main menu");

            int playerChoice = mainScanner.nextInt();

            switch (playerChoice) {
                case 0 -> done = true;
                case 1 -> ruleList.R_SPNStandard();
                case 2 -> ruleList.R_SPNLazy();
                case 3 -> ruleList.R_SPNArbitraryPileSize();
                case 4 -> ruleList.R_SPNRandomTurn();
                case 5 -> ruleList.R_SPNMultiplayer();
                default -> System.out.println("Invalid input, try again");
            }
        }
    }

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        boolean done = false;
        System.out.println(" ");
        System.out.println("Welcome to Single Pile Nim!");
        System.out.println("Please select an option from the choices below by typing in the corresponding number");

        while (!done){
            System.out.println(" ");
            System.out.println("Main Menu:");
            System.out.println("1. Rules Menu");
            System.out.println("2. Standard Single Pile Nim");
            System.out.println("3. Lazy Single Pile Nim");
            System.out.println("4. Arbitrary Pile Size Single Pile Nim");
            System.out.println("5. Random turn Single Pile Nim");
            System.out.println("6. Multiplayer Single Pile Nim");
            System.out.println("0. Exit the program");

            int playerChoice = mainScanner.nextInt();

            switch (playerChoice) {
                case 0 -> done = true;
                case 1 -> RuleMenu();
                case 2 -> GL_SPNStandard();
                case 3 -> GL_SPNLazy();
                case 4 -> GL_SPNArbitraryPileSize();
                case 5 -> GL_SPNRandomTurn();
                case 6 -> GL_SPNMultiplayer();
                default -> System.out.println("Invalid input, try again");
            }
        }


    }
}
