package Labs;
/*
Lab6.java

Name: Cameron Harter
*/
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        int Vowels = 0, Spaces = 0, LowerCases = 0;
        String Sentence;
        char ch;
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please enter a sentence");
        Sentence = Input.nextLine();
        
        for(int LetterNum = 0; LetterNum < Sentence.length() ; ++LetterNum)   {
            ch = Sentence.charAt(LetterNum);
            
            // Lowercase checker
            if ( Character.isLowerCase(ch) )   { // ( (ch >= 'a') && (ch <= 'z') ) can also be a valid option
                ++LowerCases;
            }
            
            // White Space checker
            else if (Character.isWhitespace(ch))  { // (ch == ' ') can also be a valid option
                ++Spaces;
            }
            
            ch = Character.toUpperCase(ch);
            
            // Checks for Vowels
            switch(ch)  {
                case 'A':   case 'E':  case 'I':
                case 'O':   case 'U': ++Vowels;
            }
            
        }
        System.out.println("\nVowels = " + Vowels);
        System.out.println("Spaces = " + Spaces);
        System.out.println("Lower case = " + LowerCases);
    }
}
/*
// Test 1
Please enter a sentence
This is a lovely Day.

Vowels = 6
Spaces = 4
Lower case = 14
*/