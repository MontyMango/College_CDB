/*   PROG20.JAVA 
Program will have user enter a year, a month number and a day number to determine 
the number of days that have passed since year 2000.
 */
package Class_Examples;
import java.util.*;
public class prog20 
{ public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int Year, Month, Day, DateNumber;
      
      System.out.print("Enter Year --> ");
      Year = Input.nextInt();
      System.out.print("Enter Month number --> ");
      Month = Input.nextInt();
      System.out.print("Enter Day of month --> ");
      Day = Input.nextInt();
      
      DateNumber = TotalNumberofDays(Year, Month, Day);
      
      System.out.println(DateNumber + " days have passed since 2000");     
   }
   /* *************************** TotalNumberofDays  ****************************
   Action: Will accept the year, month number and day of month to determine the total 
           number of days that have passed since turn of the century 2000.
   
   Parameters: Y is the Year, M is the month number and D is day number
   returns: total number of days since 2000
   Precondition: Year cannot be before 2000, days in month is assume to have 30
   --------------------------------------------------------------------------------*/
   static int TotalNumberofDays(int Y, int M, int D)
   {
      int YearDays, MonthDays, TotalDays;
      
      YearDays = (Y - 2000) * 365;
      MonthDays = (M-1) * 30;
      
      TotalDays = YearDays + MonthDays + D;     
   
      return TotalDays;
   }
}
/* ********************************  Output ***********************************
Enter Year --> 2021
Enter Month number --> 4
Enter Day of month --> 23
7778 days have passed since 2000             */
