/*
Name: Cameron Harter
Homework: 4
Problem: 2
Date: 9/16/2021

-------------------------------------------------------
	Source : H4_P2_CH.java

    This program is used to help you determine how
    intoxicated you are using how much you drink,
    the ounces of alcohol in the drink, and your weight
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H4_P2_CH {
    public static void main(String[] args) {
        double NumDrinks, OuncesAlcohol, Weight, BAC;
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program calculates how much alcohol you "
                + "drank\nor are going to drink and displays a message based "
                + "on the BAC");
        
        
        // NumDrinks Input
        System.out.print("\nHow much drinks did you have? --> ");
        do  {
            NumDrinks = input.nextFloat();
        } 
        while(NumDrinks < 0);
        
        
        // OuncesAlcohol Input
        System.out.print("\nHow much of ounces of alcohol was in the drink?"
                + " --> ");
        do  {
            OuncesAlcohol = input.nextFloat();
        }
        while(OuncesAlcohol < 0);
        
        
        // Weight Input
        System.out.print("\nWhat is your body weight? --> ");
        do{
            Weight = input.nextFloat();
        }
        while(Weight < 0);
        
        
        // Calculates BAC
        BAC = (4.136 * NumDrinks * OuncesAlcohol)/ Weight;
        
        
        // Messages
        if (BAC >= 0.40){
            System.out.println("Onset of coma, possible death due to "
                    + "respiratory arrest.");
        }
        else if (BAC >=.250) {
            System.out.println("Alcohol poisoning. Loss of consciousness.");
        }
        else if (BAC >=.2) {
            System.out.println("Needs assistance in walking; total mental "
                    + "confusion. Dysphoria with nausea and vomiting; "
                    + "possible blackout.");
        }
        else if (BAC >= .05) {
            System.out.println("Slurring Speech, Outwardly Behavior.");
        }
        else if (BAC > 0) {
            System.out.println("Feeling good");
        }
        else if (BAC == 0) {
            System.out.println("You are just fine");
        }
    }
}
/*
// Test 1 (3 .55 180)
How much drinks did you have? --> 3

How much of ounces of alcohol was in the drink? --> .55

What is your body weight? --> 180
Feeling good


// Test 2 (4 .55 150)
How much drinks did you have? --> 4

How much of ounces of alcohol was in the drink? --> 55

What is your body weight? --> 150
Slurring Speech, Outwardly Behavior.


// Test 3 (11 1 150)
How much drinks did you have? --> 11

How much of ounces of alcohol was in the drink? --> 1

What is your body weight? --> 150
Alcohol poisoning. Loss of consciousness.


// Test 4 (4 8 180)
This program calculates how much alcohol you drank
or are going to drink and displays a message based on the BAC

How much drinks did you have? --> 4

How much of ounces of alcohol was in the drink? --> 8

What is your body weight? --> 180
Onset of coma, possible death due to respiratory arrest.
*/