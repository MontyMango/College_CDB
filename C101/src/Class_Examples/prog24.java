/*              PROG24.JAVA

Program shows how to use arrays and how to declare arrays, both with set sizes 
and some with no size. Also shows how to correctly copy an array.  Hopefully shows
how array names are just pointers.
----------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;
public class prog24 
{
  public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int Size, i;
      final int HOWBIG = 3;         //constant used for arrays
      
      int[] X = new int[HOWBIG];    //declare integer array X of size 3
      int[] N;                      //declare integer array N of no size
      int[] P;                      //declare integer array P of no size
      
      System.out.println("Lets fill up array X with three numbers");
      for(i = 0; i < HOWBIG; i++)   //this puts data into integer array X
      {
         System.out.print("Please enter integer " + (i+1) + " --> ");
         X[i]= Input.nextInt();                       //get integer from user
      }
      
      System.out.println("Here is the array X you just entered");
      for(i = 0; i < HOWBIG; i++)
         System.out.print(X[i] + "  ");
      
      System.out.print("\n\nHow big does array N need for the copy --> ");
      Size = Input.nextInt();
      
      N = new int[Size];         //Make integer array N this size 
      
      for(i = 0; i < HOWBIG; i++)
         N[i] = X[i];            //copy elements from array X to array N
      
      System.out.println("Here is the copied array N");
      for(i = 0; i < HOWBIG; i++)
         System.out.print(N[i] + "  ");
      
      System.out.print("\n\nWhat happens when we try to copy array another way?");
      
      P = X;      //Does this also make a copy of array X?
      
      System.out.println("\n\nIs this the copied array P of array X, or is it?");
      for(i = 0; i < HOWBIG; i++)
         System.out.print(P[i] + "  ");
      
      System.out.println("\n\nLets change array P and then display array X");
      
      for(i = 0; i < HOWBIG; i++)   //this puts data into integer array P
      {
         System.out.print("Please enter integer " + (i+1) + " --> ");
         P[i]= Input.nextInt();                       //get integer from user
      }
      
      System.out.println("\nHere is array X!! WOW what happened to X, why did it change?");
      for(i = 0; i < HOWBIG; i++)
         System.out.print(X[i] + "  ");
      
      P = new int[5];
      System.out.println("\n\nHere is the array P, now size 5");
      for(i = 0; i < 5; i++)
         System.out.print(P[i] + "  ");
   }
 }
/* ********************** output  ************************************************
Lets fill up array X with three numbers
Please enter integer 1 --> 5
Please enter integer 2 --> 6
Please enter integer 3 --> 7
Here is the array X you just entered
5  6  7  

How big does array N need for the copy --> 3
Here is the copied array N
5  6  7  

What happens when we try to copy array another way?

Is this the copied array P of array X, or is it?
5  6  7  

Lets change array P and then display array X
Please enter integer 1 --> 9
Please enter integer 2 --> 0
Please enter integer 3 --> 1

Here is array X!! WOW what happened to X, why did it change?
9  0  1  

Here is the array P, now size 5
0  0  0  0  0                                   */
      

