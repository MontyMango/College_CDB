/*
Lab11.java

Name: Cameron Harter
 */
package Labs;
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        int RandomNumber, InputGuess;
        char CharStartGame;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Start the game? Y/N --> ");
        CharStartGame = input.next().charAt(0);
        
        while (Character.toUpperCase(CharStartGame) != 'N') {
            System.out.print("\nPick a number, 1, 2, or 3 --> ");
            InputGuess = input.nextInt();
            
            RandomNumber = (int) ((3 - 1 + 1) * Math.random() + 1);
            // RandomNumber = (int) Math.random()*3; // <-- This be used too
            
            match(RandomNumber, InputGuess);
            
            System.out.print("\nPlay again? Y/N --> ");
            CharStartGame = input.next().charAt(0);
        }
    }
    
/************************** match *****************************
Action: Method will determine if the Player and the Computer
have chosen the same numbers or not.

Parameters: ComputerNum - Computer's Chosen Number,
PlayerNum - Player's Chosen Number

Returns: Nothing

Preconditions: ComputerNum, PlayerNum, must be an integer
---------------------------------------------------------------*/
    static void match(int ComputerNum, int PlayerNum)  {
        if (ComputerNum == PlayerNum)   {
            System.out.println("You picked the same number as the computer");
        }
        else    {
            System.out.println("Your number is NOT the same as the compuer");
        }
    }
}
/*

*/