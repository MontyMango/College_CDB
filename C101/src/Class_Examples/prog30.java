/*  Source :  PROG30.JAVA
    Action :  Program will create a 2-D array and put the first 12 even 
              numbers into it. Will then call function to display the contents.
-------------------------------------------------------------------------*/
package Class_Examples;

public class prog30 
{
   public static void main(String[] args) 
   {
      int[][] N = new int[3][4];    //creates a 2-D array of 3 rows 4 columns
      int k = 1;
      
      for (int i = 0; i < N.length; ++i)
         for (int j = 0; j < N[i].length; ++j)
         {
            N[i][j] = 2*k;
            ++k;
         }
      
      Display2DArray(N);            
   }
   
   /* *********************************************************************
   Action: Function will accept reference to 2-D array and display the 
           contents in a tabular form.
   Parameter: 2-D array
   -------------------------------------------------------------------------*/
   static void Display2DArray(int[][] A)
   {
      for (int i = 0; i < A.length; ++i)
      {
         for (int j = 0; j < A[i].length; ++j)
            System.out.printf("%5d",A[i][j]);
         
         System.out.println("");
      }
      
   }
}

/* ******************* output  *****************************************
    2    4    6    8
   10   12   14   16
   18   20   22   24
*/
