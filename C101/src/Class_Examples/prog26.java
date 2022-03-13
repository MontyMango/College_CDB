/*   PROG26.JAVA

Program shows ways to use functions to put data into arrays and how to display arrays.

 */
package Class_Examples;
import java.util.Scanner;

public class prog26 
{
   static Scanner Input = new Scanner(System.in);  //global input variable
   
   public static void main(String[] args) 
   {
      int[] X = new int[3];  //int array of size three
      int[] Y;               //int array of no size
      
      InputArray1(X);
      System.out.println("This is X array after call to InputArray1");
      DisplayArray(X);
      System.out.println("");
      
      InputArray2(X);
      System.out.println("This is X array after call to InputArray2, note no change");
      DisplayArray(X);
      System.out.println("");
      
    //  InputArray2(Y);   // this statement causes an error, because function call 
                          // is expecting initialized array.
                          
      Y = InputArray3();
      System.out.println("This is Y array after call to InputArray3");
      DisplayArray(Y);   
   }
   
   /* *************  InputArray1 *******************************************
   This function fills up array that is passed in. Array R makes reference to array X
   back in main, so when put data into array elements also changing array elements 
   in array X back in main.
   -----------------------------------------------------------------------------*/
   static void InputArray1(int[] R)
   {
      for(int i = 0; i < R.length; ++i)
      {
        System.out.print("Enter integer #" + (i+1) + " ");
        R[i] = Input.nextInt();        
      }
   }
   
   /* *********************** InputArray2  ***************************************
   Even though initially array R makes referenc to array X in main, when you reallocate 
   R to new array, it no longer references array X in main. Array R becomes local array 
   and has nothing to do with array X back in main. This becomes a memory leak when leave 
   array.
   -------------------------------------------------------------------------------------*/
   static void InputArray2(int[] R)
   {
      int Size;
      System.out.print("\nEnter size of array ");
      Size = Input.nextInt();
      R = new int[Size]; // Redirects R to this instead of X
      
      for(int i = 0; i < R.length; ++i)
      {
        System.out.print("Enter integer #" + (i+1) + " ");
        R[i] = Input.nextInt();        
      }
   }
   
   /* ************************ InputArray3  ***********************************
   This function will create array on inside and return that array back to main.   
   ----------------------------------------------------------------------------*/
   static int[] InputArray3()
   {  int[] T;
      int Size;
      System.out.print("\nEnter size of array ");
      Size = Input.nextInt();
      T = new int[Size];
      
      for(int i = 0; i < T.length; ++i)
      {
        System.out.print("Enter integer #" + (i+1) + " ");
        T[i] = Input.nextInt();        
      }
      
      return T;
   }
   
   /* ****************** DisplayArray  *************************************
   Displays the contents of any size integer array
   -----------------------------------------------------------------------   */
   static void DisplayArray(int[] N)
   {
      for (int i = 0; i <= N.length-1; ++i)
         System.out.print(N[i] + " ");      
   }
   
}
/* ***************************  Output  *********************************
Enter integer #1 2
Enter integer #2 4
Enter integer #3 6
This is X array after call to InputArray1
2 4 6 

Enter size of array 3
Enter integer #1 1
Enter integer #2 3
Enter integer #3 5
This is X array after call to InputArray2, note no change
2 4 6 

Enter size of array 4
Enter integer #1 12
Enter integer #2 67
Enter integer #3 5
Enter integer #4 9
This is Y array after call to InputArray3
12 67 5 9
*/
