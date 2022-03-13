/*              PROG23.JAVA

  Program ask user to enter some test scores, where each one is stored in an
  array.  Program then displays the scores and then finds and displays the
  average of all of them.
----------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;

public class prog23 
{
  public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      final int SIZE = 5;                   // constant used with array
      float[] Scores = new float[SIZE];    // declares array and elements set to zero
      float Total = 0, Average;
      int i;

      for(i = 0; i < SIZE; i++)
      {
         System.out.print("Please enter test score --> ");
         Scores[i]= Input.nextFloat();                       //input test scores
      }

      System.out.println("\nEntered scores are as follows");
        
      for(i = 0; i < SIZE; i++)
          System.out.print(Scores[i] + "  ");             //displays all test scores

      for(i = 0; i < SIZE; i++)
          Total += Scores[i];                        //Totals up all test scores

      Average = Total/SIZE;

      System.out.println("\n\nThe average of the " + SIZE + " test scores is " + Average);
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
