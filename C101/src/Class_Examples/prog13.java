//              PROG13.JAVA
//
//  Program uses a "for loop" to find factorial of given positive integer.

package Class_Examples;
import java.util.*;

public class prog13 
{
  public static void main(String[] args) 
   {
     Scanner Input = new Scanner(System.in);
     int Number, Factorial = 1;
     final int MIN = 1;
     final int MAX = 10;

     System.out.print("Find the factorial of a positive integer ==> ");
     Number = Input.nextInt();

     if ( Number > MIN && Number <= MAX )
      {
       for (int i = 1; i <= Number; i++)
         Factorial *= i;

       System.out.println("\n" + Number + "! = " + Factorial);
      }
     else
       System.out.println("Number is out of range\n");
   }
}

/*---------------------------  Program Output  -------------------------

Find the factorial of a positive integer ==> 5

5! = 120

*****************************  Program Comments  ************************

1) && is used for logical AND on expressions, while & is used for bitwise
   logical AND.  || is used for logical OR on expressions and | for bitwise.

2) FOR loops may increment/decrement in any amount, not by just one. Placing
   a semicolon after the ")" is a logic error.  */