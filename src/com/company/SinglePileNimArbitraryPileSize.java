package com.company;

public class SinglePileNimArbitraryPileSize extends SinglePileNimStandard{



    public void PileSizeSetter(int i){
        singlePileSize = i;
    } // Allows us to change the size of the pile

    public void AITurn(){
        turnCounter++;
        int amountTaken = singlePileSize%4;

        if (amountTaken==0){
            amountTaken=1;
        }
        singlePileSize -= amountTaken;
        System.out.print("AI took "+amountTaken+ " tiles \n");
        PrintPile();
    } //handles the games ai for slightly more complicated games of nim
}
