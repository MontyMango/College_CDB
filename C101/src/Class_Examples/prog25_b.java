/*              PROG25_B.JAVA

Program does same thing as Prog25, but shows how to make use of the length property 
  that is associated with arrays. Just like in using strings, which are basically arrays 
  of characters.  
----------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;

public class prog25_b 
{
  static Scanner Input = new Scanner(System.in);   //note this is defined globally by using
                                                   //word "static", now all functions can 
                                                   //access this input variable.
   
  public static void main(String[] args) 
   {      
      final int SIZE = 5;                   // constant used with array
      float[] Scores = new float[SIZE];    // declares array and elements set to zero
      int i;

      ReadScores(Scores);

      System.out.println("\nEntered scores are as follows");
        
      for(i = 0; i < Scores.length; i++)
          System.out.print(Scores[i] + "  ");             //displays all test scores

      System.out.println("\n\nThe average of the " + SIZE + 
                           " test scores is " + AverageScores(Scores));
 }
/* *************************** ReadScores ****************************
   Action: Ask user to input numbers and stores them in an array. 
   
   Parameters: S is array of floats
   Precondition: none
--------------------------------------------------------------------------------*/
 static void ReadScores(float[] S)
 {
    for(int i = 0; i < S.length; i++)
      {
         System.out.print("Please enter test score --> ");
         S[i]= Input.nextFloat();                       //input test scores
      }
 }
 
/* *************************** AverageScors ****************************
   Action: Accepts an array of floats and returns the average of them.
   
   Parameters: S is array of floats
   returns: average of the numbers
   Precondition: array S needs to not be empty
--------------------------------------------------------------------------------*/
 static float AverageScores(float[] S)
 {
    float Average, Total = 0;
    
    for(int i = 0; i < S.length; i++)
          Total += S[i];                        //Totals up all test scores

      Average = Total/(S.length);

    return Average;
 }
}
/* ***************************  Program Output  **************************
 Please enter test score --> 89.78
 Please enter test score --> 96.56
 Please enter test score --> 89.50
 Please enter test score --> 57.45
 Please enter test score --> 75.34

 Entered scores are as follows
 89.78  96.56  89.5  57.45  75.34

 The average of the 5 test scores is 81.73       */
