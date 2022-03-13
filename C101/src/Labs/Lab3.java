package Labs;

/*
Name: Cameron Harter
Date: 9/15/2021
Lab 3

-------------------------------------------------------
	Source : Lab3.JAVA

    This program is used to help you find syntax errors and to see what 
    happens with data type size.
    Find all the errors in the program and get it to run.
---------------------------------------------------------
*/

import java.util.Scanner;

public class Lab3 
{
   public static void main(String[] args)
    {
      int X = 2, Y, Quotient, Remainder;
      
      Scanner Input = new Scanner(System.in);

      System.out.println("All Java expressions have a value, "
                        + "lets see some, with X = 2\n");
      System.out.println("Please enter some integer for Y --> ");
      Y = Input.nextInt();

      System.out.println("X is " + X + " and the value of Y is " + Y );
      System.out.println("The value of X + Y is " + (X + Y));
      System.out.println("The value of X - Y is " + (X - Y) );
      
      Input.nextLine();  //removes newline character left in buffer
  
      System.out.println("Are you have fun yet, I hope so, "
                         + "Press Any Key to continue");
     
      Input.nextLine(); 
        
      Quotient = Y/X;
      Remainder = Y%X;
      
      System.out.println("The Quotient of Y/X is " + Quotient);
      System.out.println("The Remainder of Y%X is " + Remainder);
      
      System.out.println("\n");

      System.out.println("Remember about the largest possible short int being 32,767");
      System.out.println("Well lets add some numbers to this and see what happens ");

      short N = 32766;
      System.out.println("\nLet's Start with N = " + N);
      ++N;
      System.out.print("Now add 1 to N ---------> " + N);
      System.out.println(" This is the maximum positive short int");
      ++N;
      
      System.out.println("Now another 1 to N -----> " + N);
      ++N;
      System.out.println("Now another 1 to N -----> " + N);
      ++N;
      System.out.println("Now another 1 to N -----> " + N);

      System.out.println("\nLook what is happening to N as you continue to add 1!");
      System.out.println("Why does this happen?\n");
    }
}

/*
All Java expressions have a value, lets see some, with X = 2

Please enter some integer for Y --> 
5
X is 2 and the value of Y is 5
The value of X + Y is 7
The value of X - Y is -3
Are you have fun yet, I hope so, Press Any Key to continue

The Quotient of Y/X is 2
The Remainder of Y%X is 1


Remember about the largest possible short int being 32,767
Well lets add some numbers to this and see what happens 

Let's Start with N = 32766
Now add 1 to N ---------> 32767 This is the maximum positive short int
Now another 1 to N -----> -32768
Now another 1 to N -----> -32767
Now another 1 to N -----> -32766

Look what is happening to N as you continue to add 1!
Why does this happen?
*/