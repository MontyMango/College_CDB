/*  Source : LAB4.CPP

   Action  : Program will display a menu and have user enter a choice,
             will continue to loop or repeat until user decides to quit.
             Menu choices are as follows:

             First choice:
               Program ask user to enter Fahrenheit temperature then
               calculates and displays the Celsius equavilent temperature.

             Second choice:
               Program ask user to enter radius of a circle then displays
               the area of circle.

             Third choice:
               Program ask user to enter any character from the keyboard
               and then tells whether entered key is a lower case letter,
               an upper case letter or no letter at all.

             Final choice:
               Program will quit when user enters a 'Q' or 'q'.


  ** NOTES **
      You need to fill in the missing code to get the program to work as
      describe above.

      Do not change any of the code with the do-while loop, and do not
      change any of the existing code, just add what you need to get it to
      work.  You may add more variables if you want to.

      Also note that this program will not compile the way it is now,
      you must add the correct code first, then compile it.

----------------------------------------------------------------------*/
package Labs;
import java.util.*;

public class Lab4 
{
  public static void main(String[] args) 
   {
     final float PI = 3.14f;
     float Fahrenheit, Radius, Celsius, Area;
     char Response, Ch;
     Scanner Input = new Scanner(System.in);

     do
      {
        System.out.print("\nChoose one of the following:\n");
        System.out.println("  1) convert Fahrenheit to Celsius");
        System.out.println("  2) calculate area of a circle");
        System.out.println("  3) Enter a character to see if upper or lower case or other");
        System.out.println("  Q) Quit");
        System.out.print("Response --> ");
        Response = Input.next().charAt(0);

        if (Response == '1')
         {
             // Asks for input and then input
             System.out.print("\nEnter a temperature in Fahrenheit to be converted --> ");
             Fahrenheit = Input.nextFloat();
             
             // Math
             Celsius = (Fahrenheit - 32) / 1.8f;
             
             // Output
             System.out.println(Fahrenheit + "°F = " + Celsius + "°C");
         }
        else if (Response == '2')
         {
             // Asks for input and then input
             System.out.print("\nEnter the radius of the circle --> ");
             Radius = Input.nextFloat();
             
             // Math
             Area = 4 * PI * Radius * Radius;
             
             // Output
             System.out.println("The area of the circle is " + Area);
         }
        else if (Response == '3')
         {
             // Asks for input and then input
             System.out.print("\nEnter a character --> ");
             Ch = Input.next().charAt(0);
             
             // Checks Ch to see if it matches any ASCII range
             
             // Uppercase
             if ((Ch >= 'A' )&&(Ch <= 'Z'))
            {
                System.out.println(Ch + " is a uppercase letter!");
            }
             // Lowercase
             else if ((Ch >= 'a')&&(Ch <= 'z'))
             {
                 System.out.println(Ch + " is a lowercase letter!");
             }
             // Not a character at all
             else {
                 System.out.println(Ch + " is not a letter at all!");
            }
          }

        else if (Response != 'Q' && Response != 'q')  // DO NOT change any code in these
              System.out.println("ILLEGAL INPUT, pick again\n\n");  //two lines or below
     }
    while (Response != 'Q' && Response != 'q');
   }
}