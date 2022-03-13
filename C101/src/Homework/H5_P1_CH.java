/*
Name: Cameron Harter
Homework: 5
Problem: 1
Date: 9/27/2021

-------------------------------------------------------
	Source : H5_P1_CH.java

    This program counts the characters that you input 
    and shows you the ASCII number for that character.
---------------------------------------------------------
 */
package Homework;

import java.util.Scanner;

public class H5_P1_CH {
    public static void main(String[] args) {
        // Declares the variables
        int UpperCaseCharacterTotal = 0, 
                LowerCaseCharacterTotal = 0, 
                NumberCharacterTotal = 0;
        char InputCharacter;
        
        // Declares a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Prints out what the program does
        System.out.println("This program counts the characters "
                + "that you input\nand shows you the ASCII number "
                + "for that character.");
        
        // Ask the user to input a character
        System.out.print("Input a character, # to exit --> ");
        // User inputs a character here
        InputCharacter = input.next().charAt(0);

        // While the input isn't a #
        while (InputCharacter != '#') {
            
            // Shows the two previous characters including the input
            System.out.println("\nThe two values that come after " +
                    (char)((int)InputCharacter) + " are " + 
                    (char)((int)InputCharacter+1) + " and " +
                    (char)((int)InputCharacter+2));
            
            // If the input is a capital character
            if ((InputCharacter >= 'A') && (InputCharacter <= 'Z'))  {
                // Add one to the Uppercase Total
                ++UpperCaseCharacterTotal;
                        }
            
            // else if the input is a lowercase character
            else if ((InputCharacter >= 'a') && (InputCharacter <= 'z'))   {
                // Add one to the Lowercase Total
                ++LowerCaseCharacterTotal;
                        }
            
            // else if the input is a digit
            else if ((InputCharacter >= '0') && (InputCharacter <= '9')) {
		// Add one to the Number Character Total
                ++NumberCharacterTotal;
                        }
            
            // Displays the Character and it's ASCII value
            System.out.println(InputCharacter + "'s ASCII value is "
                    + (int)InputCharacter);
        
            // Asks to input another character
            System.out.print("\nInput another character, # to exit --> ");
            // User inputs another character here
            InputCharacter = input.next().charAt(0);
                }
        
        // Displays how much Uppercase, Lowercase, & 
        // Number characters that the user inputted in total
        System.out.println("\nYou inputted:");
        System.out.println(UpperCaseCharacterTotal + " Uppercase Letters");
        System.out.println(LowerCaseCharacterTotal + " Lowercase Letters");
        System.out.println(NumberCharacterTotal + " Numbers"); 

    }
}

/*
// Test 1 (3 1 d #)
This program counts the characters that you input
and shows you the ASCII number for that character.
Input a character, # to exit --> 3

The two values that come after 3 are 4 and 5
3's ASCII value is 51

Input another character, # to exit --> 1

The two values that come after 1 are 2 and 3
1's ASCII value is 49

Input another character, # to exit --> d

The two values that come after d are e and f
d's ASCII value is 100

Input another character, # to exit --> #

You inputted:
0 Uppercase Letters
1 Lowercase Letters
2 Numbers



// Test 2 (a $ 0 I #)
This program counts the characters that you input
and shows you the ASCII number for that character.
Input a character, # to exit --> a

The two values that come after a are b and c
a's ASCII value is 97

Input another character, # to exit --> $

The two values that come after $ are % and &
$'s ASCII value is 36

Input another character, # to exit --> 0

The two values that come after 0 are 1 and 2
0's ASCII value is 48

Input another character, # to exit --> I

The two values that come after I are J and K
I's ASCII value is 73

Input another character, # to exit --> #

You inputted:
1 Uppercase Letters
1 Lowercase Letters
1 Numbers


// Test 3 (/ * - = ~ < #)
This program counts the characters that you input
and shows you the ASCII number for that character.
Input a character, # to exit --> /

The two values that come after / are 0 and 1
/'s ASCII value is 47

Input another character, # to exit --> *

The two values that come after * are + and ,
*'s ASCII value is 42

Input another character, # to exit --> -

The two values that come after - are . and /
-'s ASCII value is 45

Input another character, # to exit --> =

The two values that come after = are > and ?
='s ASCII value is 61

Input another character, # to exit --> ~

The two values that come after ~ are  and 
~'s ASCII value is 126

Input another character, # to exit --> <

The two values that come after < are = and >
<'s ASCII value is 60

Input another character, # to exit --> #

You inputted:
0 Uppercase Letters
0 Lowercase Letters
0 Numbers
*/