//              PROG27.JAVA
//
//  Program fills an integer array with random numbers between 1 and 100
//  Then passes array, to function to return the largest int in array
package Class_Examples;
import java.util.Scanner;
public class prog27 
{
  public static void main(String[] args) 
   {
      final int ARRAY_SIZE = 10;
      int[] N = new int[ARRAY_SIZE];
      
      for (int i = 0; i < ARRAY_SIZE; i++)      //this fills array
         N[i] = (int)(100*Math.random()+1);     //with random numbers between 1 and 100

      System.out.println("The maximum number in the N array is " + MaxNumberArray(N));
   }
/* ******************  MaxNumberArray  ************************************
Action  :  This function accepts an integer array of any size given and
           returns the maximum number in the array.  The given array is
           considered to be constant so can't inadvertently destroy original.
Parameters: S, constant integer array, source array to find largest

Returns : the maximum int found in array
------------------------------------------------------------------------*/
static int MaxNumberArray(final int S[])
{
  int MaxNumber = 0;

  for (int i = 0; i < S.length; i++)       //searches the whole array and
    if ( S[i] > MaxNumber )                //finds the largest value and saves it
       MaxNumber = S[i];

  return MaxNumber;
}
}
/* **********************  Program Comments  *******************************
1) When arrays are passed to functions a copy of the whole array is not
   passed down, just the array address is passed or subscript 0.

2) If do not want to change the contents of an array, then declare the parameter as a 
   constant of final.

3) Array defined as "int[] X = new int[5];"  has five elements in array, but the first
   element is referenced by the subscript 0, hence X[0], X[1], .. X[4]
   Therefore last element is always referenced by one less then array size.
4) One can reference the length property of an array to find the number of elements */