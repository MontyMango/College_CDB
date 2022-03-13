/*     PROG19.JAVA 
Program will have user enter number between 1 and 7 and then call a function that 
will then return the corresponding day of the week as a string.
 */
package Class_Examples;
import java.util.*;

public class prog19 
{
   public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int N;
      
      do
      {
        System.out.print("\nPlease enter a number between 1 and 7 to " 
                        + "represent a day of week, 0 to quit ");
        N = Input.nextInt();
      
        System.out.println(N + " corresponds to " + DayOfWeek(N));
      }
      while ( N != 0);
   }
   
   /* ********************** DayOfWeek *******************************
   Action: Function will accept a number between 1 and 7 and return 
   the corresponding day of week.
   Parameter: Number that corresponds to day of week
   returns: String that is day of week
   precondition: none
   ------------------------------------------------------------------*/
   static String DayOfWeek(int Number)
   {
      switch (Number)
      {
        case 1: return "Sunday";
        case 2: return "Monday";
        case 3: return "Tuesday";
        case 4: return "Wednesday";
        case 5: return "Thursday";
        case 6: return "Friday";
        case 7: return "Saturday";
        default: return "Error";              
      }
   }
}
/* ************************** Output ***************************************
Please enter a number between 1 and 7 to represent a day of week, 0 to quit 3
3 corresponds to Tuesday

Please enter a number between 1 and 7 to represent a day of week, 0 to quit 6
6 corresponds to Friday
*/
