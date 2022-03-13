/*
Name: Cameron Harter
Homework: 6
Problem: 3
Date: 10/17/2021

-------------------------------------------------------
	Source : H6_P3_CH.java
    This program asks for two strings, and it displays
    both strings' length, upper case character count,
    both strings combinded, and both strings in uppercase.
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H6_P3_CH {
    public static void main(String[] args) {
        int Capitals = 0;
        String InputString1, InputString2, Sentence;
        char LetterChar;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Enter first string --> ");
        InputString1 = Input.nextLine();
        
        System.out.print("second string --> ");
        InputString2 = Input.nextLine();
        
        Sentence = InputString1 + " " + InputString2;
        
        
        // Checks to see if the sentence has any uppercase characters
        for(int LetterNum = 0; LetterNum < Sentence.length(); ++LetterNum)
        {
            LetterChar = Sentence.charAt(LetterNum);
            if(Character.isUpperCase(LetterChar)) {
                ++Capitals;
            }
        }
        
        
        System.out.printf("%-16s", "\nString one");
        System.out.print("--> \"" + InputString1 + "\", Length = " 
                + InputString1.length() + "\n");
        
        System.out.printf("%-15s", "String two");
        System.out.print("--> \"" + InputString2 + "\", Length = " 
                + InputString2.length() + "\n");
        
        System.out.printf("%-15s", "String combined");
        System.out.print("--> \"" + Sentence + "\", Length = " 
                + Sentence.length() + "\n\n");
        
        System.out.printf("%-18s", "String Upper Case");
        System.out.print("--> \"" + Sentence.toUpperCase() + "\"\nThe" 
                + " final string has " + Capitals + 
                " upper case characters\n");
    }
}
/*
// Test 1 (Example Test)
Enter first string --> This
second string --> is Fun!

String one     --> "This", Length = 4
String two     --> "is Fun!", Length = 7
String combined--> "This is Fun!", Length = 12

String Upper Case --> "THIS IS FUN!"
The final string has 2 upper case characters


// Test 2 (Numbers Test)
Enter first string --> 12345
second string --> 67890

String one     --> "12345", Length = 5
String two     --> "67890", Length = 5
String combined--> "12345 67890", Length = 11

String Upper Case --> "12345 67890"
The final string has 0 upper case characters


// Test 3 (Random symbols & second empty string test)
Enter first string --> )(@*$)&@!?
second string --> 

String one     --> ")(@*$)&@!?", Length = 10
String two     --> "", Length = 0
String combined--> ")(@*$)&@!? ", Length = 11

String Upper Case --> ")(@*$)&@!? "
The final string has 0 upper case characters


// Test 4 (Empty String Test)
Enter first string --> 
second string --> 

String one     --> "", Length = 0
String two     --> "", Length = 0
String combined--> " ", Length = 1

String Upper Case --> " "
The final string has 0 upper case characters
*/