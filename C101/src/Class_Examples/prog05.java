//               PROG05.JAVA
//
//    Program reads in how many nickels and pennies a person has
//    and then displays the amount in dollars and cents
//

package Class_Examples;
import java.util.Scanner;

public class prog05 
{
  public static void main(String[] args) 
   {
     int Nickels, Pennies, TotalValue, Dollar, Cents;

     final int PENNIES_IN_DOLLAR = 100;  // defines a constant
     Scanner Input = new Scanner(System.in);  

     System.out.println("Please enter the number of nickels --> "); 
     Nickels = Input.nextInt();
     System.out.println("Please enter the number of pennies --> ");
     Pennies = Input.nextInt();

     TotalValue = 5*Nickels + Pennies;
     Dollar = TotalValue / PENNIES_IN_DOLLAR;
     Cents = TotalValue % PENNIES_IN_DOLLAR;

     System.out.println("\nYou have " + Dollar + " dollars and " + 
                        Cents + " cents.");
   }
}

/*-------------------  Program Output  ----------------------------

Please enter the number of nickels --> 35
Please enter the number of pennies --> 78

You have 2 dollars and 53 cents.

***************************  Program Comments  ***********************

1) Spell out variable names, using the style that first letter is
   uppercase and subsequent letters are not.

2) Use constants to avoid having "Magic Numbers" in program.

*/