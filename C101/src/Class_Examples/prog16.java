/*              PROG16.JAVA
Action : Program ask user to enter Length and Width of rectangle then calls
         a function/method that calculates the area of rectangle. Then calls
         another function that displays a rectangle on the screen.
------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;

public class prog16 
{
  public static void main(String[] args) 
   {
     Scanner Input = new Scanner(System.in);
     int Length, Width;
     
     System.out.print("Please enter length of square --> ");
     Length = Input.nextInt();
     System.out.print("Please enter Width of square --> ");
     Width = Input.nextInt();

     System.out.println("\nThe area of the square is " + SquareArea(Length, Width));
     System.out.println("The shape of square looks like");
     ShowSquare();  
   }

/*************************  ShowSquare  ******************************
Action :  Just displays the shape of a square on the screen
Parameters : None
Returns   : Nothing
Preconditions : none
--------------------------------------------------------------------*/
 static void ShowSquare()
  {
   System.out.print("************\n");
   System.out.print("*          *\n");
   System.out.print("*          *\n");
   System.out.print("************\n");
  }
/***************************  SquareArea  ******************************
Action  : calculates the area of a rectangle and returns it.
Parameters: L - Length, W - Width, both are positive integers  
Returns  : int, which is the area, or L * W
Preconditions : inputs must be positive, non zero
----------------------------------------------------------------------*/
 static int SquareArea(int L, int W)
  {
   return L*W;
  }
}
/*************************  Program Output  ***************************
Please enter length of square --> 7
Please enter Width of square --> 4

The area of the square is 28
The shape of square looks like
************
*          *
*          *
************        */