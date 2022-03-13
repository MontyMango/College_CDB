//          PROG14.CPP
//
//  Program shows how to use and call simple void functions, i.e. nothing
//  is passed into or out of function.

package Class_Examples;
import java.util.*;

public class prog14 
{
  public static void main(String[] args) 
   {
     DrawLine();
     AddTwoNumbers();
     DrawLine();      
   }

/**********************  DrawLine  *************************************
  Action : Will just draw a line on output screen made of stars "*"
----------------------------------------------------------------------*/
static void DrawLine()
 {
   System.out.print("\n************************************\n");
 }

/**********************  AddTwoNumbers  *******************************
  Action : Will ask user to enter two numbers and then display the sum
---------------------------------------------------------------------*/
static void AddTwoNumbers()
 {
   Scanner Input = new Scanner(System.in);   //not always good idea, 
                                             //will see better way later
   int X, Y;

   System.out.print("Please enter two numbers --> ");
   X = Input.nextInt();
   Y = Input.nextInt();
  
   System.out.print(X + " + " + Y + " = " + (X + Y));
 }
}
/*--------------------------  Program Output  ---------------------------
 ************************************
 Please enter two numbers --> 6  12
 6 + 12 = 18
 ************************************/