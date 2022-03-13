//              PROG08.JAVA
//
// This program introduces the while loop.  Program will reverse the digits
// of an integer

package Class_Examples;
import java.util.*;

public class prog08 
{
  public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int Original, Reversed, RightDigit;
      
      System.out.print("Enter Digit to reverse ==> ");
      Original = Input.nextInt();
      
      System.out.print("\nThe reverse of " + Original + " is ");
      
      Reversed = 0;
      while (Original != 0)                     //stop when original is used up
       {
         RightDigit = Original % 10;            //RightDigit = Original mod 10
         Reversed = Reversed * 10 + RightDigit; //Add right digit to reversed
         Original = Original/10;                //eliminate right digit
       }
      System.out.println(Reversed);
    }
}

/*-------------------------- Program Output ---------------------------

Enter Digit to reverse ==> 123456789

The reverse of 123456789 is 987654321

***************************** program comments *************************
1) While loops work in expected manner, the loop body continues to execute
   as long as the condition is true, when condition is false then terminate.

2) The logical expression in the while loop must be enclosed in paranthesis.

3) If the loop body has more than one statement then it is a compound statement
   and must be enclosed in "{" and "}".  No semicolon is needed after the
   right "}".

4) Indentation is done only for the ease of reading the program   */