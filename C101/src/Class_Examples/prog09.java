/*       Program  PROG09.JAVA

   Action :  Problem continue to ask user to enter numbers and keeps track
             of the largest and smallest entered.  Input ends when user
             enters zero.

             It will also keep a running total of all the even numbers
             entered and display that sum as well.
------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;
public class prog09 {
  public static void main(String[] args){
      Scanner Input = new Scanner(System.in);
      int Largest, Smallest, Number, EvenSum = 0;
      
      System.out.print("Please enter a number, zero to quit --> ");
      Number = Input.nextInt();
      Largest = Smallest = Number;
      
      while (Number != 0) // While the inputed number isn't 0
       {
         if (Number > Largest)  // If the number is larger than the largest
           Largest = Number;    // The number will be the new largest number

         if (Number < Smallest) // If the number is smaller than the smallest
           Smallest = Number;   // The number will be the new smallest number

         if (Number % 2 == 0)      // If the number is even
           EvenSum = EvenSum + Number;  // Add the number to the even numbers total

         System.out.print("Enter next number --> ");
         Number = Input.nextInt();
      }
      System.out.println("\nLargest number entered is " + Largest);
      System.out.println("The Smallest number entered is " + Smallest);
      System.out.println("The sum of the even numbers is " + EvenSum);
   }
}
/******************************  Program Output  ************************
 Please enter a number, zero to quit --> 6
 Enter next number --> 2
 Enter next number --> 7
 Enter next number --> 13
 Enter next number --> 1
 Enter next number --> 0

 The Largest number entered is 13
 The Smallest number entered is 1
 The sum of the even numbers is 8  */