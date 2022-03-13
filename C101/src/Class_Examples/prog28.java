/*  Source :  PROG28.JAVA
    Action :  Program will load two integer arrays with random numbers
              between 1 and 10. Will then determine if two arrays are
              identical and then will determine the array position of the
              smallest number found in the first array
-------------------------------------------------------------------------*/
package Class_Examples;
import java.util.Scanner;

public class prog28 
{   
 public static void main(String[] args) 
  {
     final int SIZE = 10;
     int[] First = new int[SIZE], Second = new int[SIZE];
     int SmallestPosition;
      
     FillArray(First);
     FillArray(Second);

     System.out.println("The First array is");
     ShowArray(First);

     System.out.println("\n\nThe Second array is");
     ShowArray(Second);

     if ( ArraysSame(First, Second) )
        System.out.println("\n\nThe arrays are the same");
     else
        System.out.println("\n\nThe arrays are not the same");

     SmallestPosition = SmallPosition(First);

     System.out.println("The smallest element is in array element "+ SmallestPosition);
}

// Function fills up array with random numbers between 1 and 10
static void FillArray(int M[])
{   
  for (int i = 0; i < M.length; i++)
     M[i] = (int)(1 + Math.random()*10);
}

// Function will display array on screen
static void ShowArray(final int X[])
{
  for (int i = 0; i < X.length; i++)
    System.out.print(X[i] + "  ");
}

// Function will determine if two arrays are same, ie same elements
static boolean ArraysSame(int A[], int B[])
{
   if (A.length != B.length)        //if lengths are different, then not the same
      return false;
   
   for (int i = 0; i < A.length; i++)
     if ( A[i] != B[i] )
       return false;

  return true;
}

/* *********************** FindPositions ******************************
Action : Will determine subscript number for the smallest number in the array.
Parameters:  The integer array to find smallest number of
Returns : Subscript of the smallest number
---------------------------------------------------------------------*/
static int SmallPosition(int N[])
{
  int Small = 0;  //Let first position be smallest number

  for (int i = 1; i < N.length; i++)
    { 
      if ( N[Small] > N[i] )
        Small = i;
    }
  return Small;
}
}
/* ****************************  Program Output  ************************
The First array is
8  2  4  5  2  4  9  4  8  10  

The Second array is
1  3  1  1  5  10  8  3  3  4  

The arrays are not the same
The smallest element is in array element 1         */