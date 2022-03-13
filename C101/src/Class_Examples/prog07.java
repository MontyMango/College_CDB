/*------------------------------------------------------------------
Source  : PROG07.JAVA

Action  : Program takes any positive integer and lists all the proper
          divisors of the number

********************************************************************/

package Class_Examples;
import java.util.*;

public class prog07 
{
  public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int Number, Divisor = 1;
      
      System.out.print("Please enter a positive integer --> ");
      Number = Input.nextInt();
      System.out.println("\nThe divisors of " + Number + " are as follows:");
      
      while (Divisor <= (Number/2))
      {
        if ((Number % Divisor) == 0)
            System.out.print(Divisor + "  ");
        Divisor++;
      }
      System.out.println();
   }
}

/*--------------------------  Program Output  -------------------------

 Please enter a positive integer --> 24

 The divisors of 24 are as follows:
 1  2  3  4  6  8  12

******************************  Program Comments **********************

1)  While loops will loop on an expressionial boolean value of "true"

2)  The Expression must be enclosed in paranthesis.

3)  Loop body must start with "{" and end with  "}", if have more then
    one statement.
*/