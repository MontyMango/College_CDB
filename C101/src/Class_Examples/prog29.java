/*  Source :  PROG29.JAVA
    Action :  Program will show what happens when try to copy one array into 
              another by using a function. This is done two separate ways.
              
              Need to explain why this is happening?
-------------------------------------------------------------------------*/
package Class_Examples;

public class prog29 
{
   public static void main(String[] args) 
   {
      final int SIZE = 3;
      int[] N = {2,4,6};
      int[] M = {1,3,5};
      int[] X = new int[SIZE], Y = new int[SIZE];      
      
      CopyArray1(N,X); 
      System.out.println("After call to CopyArray1 copied array in main is:");
      ShowArray(X);
      
      System.out.println("");
      
      CopyArray2(M,Y);
      System.out.println("After call to CopyArray2 copied array in main is:");      
      ShowArray(Y);   
      
      System.out.println("");      
   }
  
  // This function will copy one array into another using a for loop and copy 
  // one element at time.
  static void CopyArray1(int[] A, int[] B)
  {
     for (int i = 0; i < A.length; ++i)
        B[i] = A[i];
     
     System.out.println("In CopyArray1, copied array is as follows:");
     ShowArray(B);
     System.out.println("");
  }
  
  // This function will simply let one array equal the other to copy the elements
  static void CopyArray2(int[] A, int[] B)
  {
     B = A;
     
     System.out.println("\nIn CopyArray2, copied array is as follows:");
     ShowArray(B);
     System.out.println("");             
  }
  
  // Function will display array on screen
  static void ShowArray(final int X[])
  {
    for (int i = 0; i < X.length; i++)
      System.out.print(X[i] + "  ");
  } 
   
}
/* **************************** Program Output **************************
In CopyArray1, copied array is as follows:
2  4  6  
After call to CopyArray1 copied array in main is:
2  4  6  

In CopyArray2, copied array is as follows:
1  3  5  
After call to CopyArray2 copied array in main is:
0  0  0                                                    */
