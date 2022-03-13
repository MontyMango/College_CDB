//              PROG04.JAVA
//
// This Java program will have the user enter Fahrenheit temperature and
// then convert it to Celsius temperature and display it.

package Class_Examples;
import java.util.Scanner;

public class prog04 
{
   public static void main(String[] args) 
    {
       float Fahrenheit, Celsius;
       Scanner Input = new Scanner(System.in);
       
       System.out.println("Please enter the Fahrenheit temperature --> ");
       Fahrenheit = Input.nextFloat();

       Celsius = (float)((5.0/9.0) * (Fahrenheit - 32));
  
       System.out.println("\nThe Celsius temperature is " + Celsius);
     }   
}

/*---------------------  Program Output  ---------------------------------

Please enter the Fahrenheit temperature --> 100

The Celsius temperature is 37.77778


************************** Program Comments ******************************

1) Blank lines in programs are not needed, they just help organize program
   into certain related areas and make it easier to read.

2) Indentation is also recommended, it makes reading programs easier to
   follow.
*/