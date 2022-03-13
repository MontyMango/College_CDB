//              PROG10.JAVA
//
//  This program uses the do-while loop along with abbreviated assignment
//  operators to calculate the factorial of an integer

package Class_Examples;
import java.util.*;

public class prog10 
{
  public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int Factorial = 1, Number, Original;
      
      System.out.print("Please enter an integer ==> ");
      Number = Input.nextInt();
      Original = Number;
      
      do
       {
         Factorial *= Number;         //same as Factorial = Factorial * Number
         --Number;                    //same as Number = Number - 1
       }
     while (Number > 0);
      
      if (Factorial <= 0)
         System.out.println("ERROR, number to big to find Factorial\n");
      else
         System.out.println("Factorial of " + Original + " is " + Factorial);
   }
}
/*-----------------------  Program Output  -----------------------------

Please enter an integer ==> 5
Factorial of 5 is 120


**************************  Program Comments  **************************

1) Do-While loops work as expected.

2) Loop body repeats until condition is false, therefore loops on true.

3) Loop body always executes at least once in Do-While loop.

4) Abbreviated assignment operators often cause compiler to compile faster,
   ex. c += 3; same as c = c + 3;   */