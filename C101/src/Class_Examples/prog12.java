//              PROG12.JAVA
//  Program uses the "switch" statement to count number of even, odd or other
//  type of character entered by user.  Input terminates with # key.

package Class_Examples;
import java.util.*;

public class prog12 
{
  public static void main(String[] args) 
   {
     Scanner Input = new Scanner(System.in);
     char Ch;
     int OddCount   = 0,
         EvenCount  = 0,
         OtherCount = 0;

     System.out.print("Enter character, # to quit --> ");
     Ch = Input.next().charAt(0);
     while (Ch != '#')
     {
      switch (Ch)
         {
          case '0': case '2': case '4':
                    case '6': case '8': ++EvenCount;
                                        break;

          case '1':
          case '3':
          case '5':
          case '7':
          case '9': ++OddCount;
                    break;

          default : ++OtherCount;
         }
       System.out.print("Enter character, # to quit --> ");
       Ch = Input.next().charAt(0);
      }
    System.out.println("\nOdd Digits  = " + OddCount);
    System.out.println("Even Digits = " + EvenCount);
    System.out.println("Other char  = " + OtherCount);
   }
}
/*------------------- Program Output --------------------------------
Enter character, # to quit --> 5
Enter character, # to quit --> y
Enter character, # to quit --> 7
Enter character, # to quit --> 8
Enter character, # to quit --> i
Enter character, # to quit --> ,
Enter character, # to quit --> #

Odd Digits  = 2
Even Digits = 1
Other char  = 3

*********************  Program Comments  *******************************
1) For the "switch" statement, after each "case label" there are 0 or more
   statements to be executed if the constant is equal to the value of the
   variable specified by "switch".  After the statement(s) are executed,
   control falls through to the cases below unless a break statement is placed.
   For example, without the break statement in the even case, control would
   drop down to the odd case and OddCount would also be incremented.

2) The default statement will execute if none of the other labels match.  The
   "default" case does not have to be last.

3) If no match is found and no "default" case given, control simply falls
   through and no action is taken in "switch" statement. */