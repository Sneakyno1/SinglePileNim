package com.company;
// the entire purpose of this class is to store rules for each game mode
// more will be added as more game modes are added
public class Rules {
     void R_SPNStandard(){
         System.out.println();
         System.out.println("Rules for Standard Single Pile Nim:");
         System.out.println("1. The winner is the person who takes the last tile.");
         System.out.println("2. Each player (you and the AI) may take 1, 2, or 3 tiles per turn. No more or less.");
         System.out.println("To play, select Standard Single Pile Nim from the main menu. The player and AI");
         System.out.println("then take turns taking tiles from the pile starting with the player");
         System.out.println();
     }
     void R_SPNLazy(){
         System.out.println();
         System.out.println("Rules for lazy Single Pile Nim:");
         System.out.println("1. The winner is the person who takes the last tile.");
         System.out.println("2. Each player (you and the AI) may take 1, 2, or 3 tiles per turn. No more or less.");
         System.out.println("To play, select Lazy Single Pile Nim from the main menu. The player and AI");
         System.out.println("then take turns taking tiles from the pile starting with the player");
         System.out.println();
     }
     void R_SPNArbitraryPileSize(){
         System.out.println();
         System.out.println("Rules for Arbitrary Pile Size Single Pile Nim:");
         System.out.println("1. Enter in a number for how many tiles there will be in the pile");
         System.out.println("2. The winner is the person who takes the last tile.");
         System.out.println("3. Each player (you and the AI) may take 1, 2, or 3 tiles per turn. No more or less.");
         System.out.println("To play, select Arbitrary Pile Size Single Pile Nim from the main menu. The player and AI");
         System.out.println("then take turns taking tiles from the pile starting with the player");
         System.out.println();
     }
     void R_SPNRandomTurn(){
         System.out.println();
         System.out.println("Rules for Random Turn Single Pile Nim:");
         System.out.println("1. Each turn, there is a 50% chance for either the player or AI to take a turn");
         System.out.println("2. The winner is the person who takes the last tile.");
         System.out.println("3. Each player (you and the AI) may take 1, 2, or 3 tiles per turn. No more or less.");
         System.out.println("To play, select Random Turn Single Pile Nim from the main menu. The player and AI");
         System.out.println("then take turns taking tiles from the pile starting with the player");
         System.out.println();
     }
     void R_SPNMultiplayer(){
         System.out.println();
         System.out.println("Rules for Multiplayer Single Pile Nim:");
         System.out.println("1. The winner is the person who takes the last tile.");
         System.out.println("2. Each player may take 1, 2, or 3 tiles per turn. No more or less.");
         System.out.println("To play, select Multiplayer Single Pile Nim from the main menu.");
         System.out.println("Two players then take turns taking tiles from the pile starting with player 1");
         System.out.println();
     }
}
