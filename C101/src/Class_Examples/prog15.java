/*******************************************************************
Author   :
Date     :
Source   : PROG15.JAVA
Compiler : Java
Action   : This program will repeatedly ask user to enter two separate
           integers and then use a function to calculate the absolute
           difference between the two. The result is also displayed
           on the screen.  Program will quit when absolute difference is zero.
Note     : Program only works for integers.
***********************************************************************/

package Class_Examples;
import java.util.*;

public class prog15 
{

/***************************  AbsoluteDifference  **********************
Action   :  Function will accept any two integers, positive or negative,
            and find the absolute difference of the two.  It will always
            subtract the second from the first.
Parameters
   IN     : X and Y, which hold the corresponding two inputted integers
   
Returns   : int, which is absolute difference of X and Y

Preconditions : Numbers Must be integer type only.
-----------------------------------------------------------------------*/
static int AbsoluteDifference(int X, int Y)
{
  if (X > Y)
     return  X - Y;
  else
     return  Y - X;
}
//========================================================================

public static void main(String[] args) 
 {
  int Number1, Number2, Difference;
  Scanner Input = new Scanner(System.in);

  System.out.print("This program finds the absolute difference between any two "
                       + "integers.\nProgram quits when difference is 0\n\n");

  do
    {
      System.out.print("Enter first integer --> ");
      Number1 = Input.nextInt();
      System.out.print("Enter second integer --> ");
      Number2 = Input.nextInt();
      Difference = AbsoluteDifference(Number1,Number2);
       
      System.out.println("The absolute difference between " + Number1 + " and "
                         + Number2 + " is " + Difference + "\n");
    }
  while (Difference != 0);
 }
}
/*************** program output *************************
This program finds the absolute difference between any two integers.
Program quits when difference is 0

Enter first integer --> 6
Enter second integer --> 8
The absolute difference between 6 and 8 is 2    */