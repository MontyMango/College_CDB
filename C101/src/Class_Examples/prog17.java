//              PROG17.JAVA
//
//  Program uses function/method "LeftMostDigit" to find the left most digit of int

package Class_Examples;
import java.util.*;

public class prog17 
{
  public static void main(String[] args) 
   {
     Scanner Input = new Scanner(System.in);
     int Number;

     System.out.println("This program test the function LeftMostDigit");
     System.out.print("To end program, enter 0.\n\n");
     System.out.print("Enter integer ==> ");
     Number = Input.nextInt();

     while (Number != 0)
     {
        System.out.print("The leftmost digit of " + Number + " is "
                    +LeftMostDigit(Number));
        System.out.print("\n\nEnter next integer ==> ");
        Number = Input.nextInt();
     }  
}
/* ********************  LeftMostDigit *****************************
Description : Computes and returns the leftmost digit of an int

Parameters  :N  holds the integer whose leftmost digit will be returned.
 
Returns     : The leftmost digit of int N

Precondition: N must be non-negative
--------------------------------------------------------------------------*/
static int LeftMostDigit (int N)
{
  while (N >= 10)
    N /= 10;

  return N;
}
}
/* *********************** Program Comments ******************************
The actual parameter Number is passed by value to formal parameter N.  Only
a copy is passed into function.  Destroying N does not affect Number.  */