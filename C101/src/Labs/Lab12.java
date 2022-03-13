/*
Lab11.java

Name: Cameron Harter
 */
package Labs;
import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String InputSentence;
        
        System.out.println("Enter some sentence:");
        InputSentence = input.nextLine();
        
        System.out.println("\nYour sentence has " + Check_WhiteSpaces(InputSentence) + " words.");
        System.out.println("And your sentence has " + InputSentence.length() + " characters.");
        System.out.println("\nYour sentence backwards is as follows:\n" + Backwards_String(InputSentence));
    }
    
    
/************************* Check_WhiteSpaces ****************************
Action: This method checks for white spaces in the sentence

Parameters: 
CurrentChar - A char from the sentence
WhiteSpaces - The number of white spaces in the sentence
CharNum - The char number selected from the sentence
Input - Sentence Input

Returns: An int

Preconditions: Input must be a String.
---------------------------------------------------------------*/
    static int Check_WhiteSpaces(String Input)    {
        char CurrentChar = Input.charAt(0);
        int CharNum, WhiteSpaces = 0;
        
        for(CharNum = 1; CharNum < Input.length(); CharNum++)
            if (Character.isWhitespace(CurrentChar))    {
                ++WhiteSpaces;
            }
        return WhiteSpaces + 1;
    }

/************************* Backwards_String ****************************
Action: This method makes the string backwards

Parameters: 
Backwards - The string sentence backwards
temp - The character + the sentence backwards
Char - A char from the sentence
CharNum - The char number selected from the sentence
Input - Sentence Input

Returns: A String

Preconditions: Input must be a String.
---------------------------------------------------------------*/
    static String Backwards_String(String Input)   {
        String Backwards = "", temp;
        char Char;
        
        for(int CharNum = 0; CharNum < Input.length(); ++CharNum)   {
            Char = Input.charAt(CharNum);
            temp = Character.toString(Char);
            
            temp += Backwards;
            Backwards = temp;   
        }
          
        return Backwards;
    }
}
/*
  // It could also been done like this too... I just had a brain fart.
        
    static String Backwards_String(String Input)   {
        String Backwards = "";
        char Char;
        
        for(int CharNum = Input.length() - 1 ; CharNum >= 0; --CharNum)   {
            Char = Input.charAt(CharNum);
            Backwards += Char;   
        }
        return Backwards;
    }
/*    
  


Enter some sentence:
This is fun!

Your sentence has 1 words.
And your sentence has 12 characters.

Your sentence backwards is as follows:
!nuf si sihT
*/