/*              PROG25.JAVA

Program does same thing as Prog23, but uses functions. 

Program ask user to enter some test scores, where each one is stored in an
array.  Program then displays the scores and then finds and displays the
average of all of them.  Two functions used for this one to read in the test scores 
the other to find the average.

Also shows how input variable can be defined globally so all functions can 
access the input variable.
----------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;

public class prog25 
{
  static Scanner Input = new Scanner(System.in);   //note this is defined globally by using
                                                   //word "static", now all functions can 
                                                   //access this input variable.
   
  public static void main(String[] args) 
   {      
      final int SIZE = 5;                   // constant used with array
      float[] Scores = new float[SIZE];    // declares array and elements set to zero
      int i;

      ReadScores(Scores, SIZE);

      System.out.println("\nEntered scores are as follows");
        
      for(i = 0; i < SIZE; i++)
          System.out.print(Scores[i] + "  ");             //displays all test scores

      System.out.println("\n\nThe average of the " + SIZE + 
                           " test scores is " + AverageScores(Scores, SIZE));
 }
/* *************************** ReadScores ****************************
   Action: Ask user to input numbers and stores them in an array.  Will only read in 
           Size amount.
   
   Parameters: S is array of floats and Size is the number of elements in array
   Precondition: Size is not larger then actual array.
--------------------------------------------------------------------------------*/
 static void ReadScores(float[] S, int Size)
 {
    for(int i = 0; i < Size; i++)
      {
         System.out.print("Please enter test score --> ");
         S[i]= Input.nextFloat();                       //input test scores
      }
 }
 
/* *************************** AverageScors ****************************
   Action: Accepts an array of floats and returns the average of them.
   
   Parameters: S is array of floats and Size is the number of elements in array
   returns: average of the numbers
   Precondition: Size is not larger then actual array.
--------------------------------------------------------------------------------*/
 static float AverageScores(float[] S, int Size)
 {
    float Average, Total = 0;
    
    for(int i = 0; i < Size; i++)
          Total += S[i];                        //Totals up all test scores

      Average = Total/Size;

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
