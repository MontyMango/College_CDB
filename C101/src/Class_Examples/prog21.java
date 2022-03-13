/*	PROG21.JAVA

This program shows the use of random() function of the Math class that can be used to 
generate psuedo random numbers.

------------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;
public class prog21 
{ 
   public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      
      final int LARGEST = 100;	//this is the largest random number
      final int HOW_MANY = 15;      // display 15 random numbers

      System.out.println("15 random numbers between 0 and 99");
  
      for (int N = 1; N <= HOW_MANY; ++N)
         System.out.print((int)(LARGEST*Math.random()) + "  ");
      
      
      System.out.println("\n\nNumber between 1 and 6 inclusive");
      System.out.println((int)(6*Math.random()+1));  
    }
}
/* ***********************  Output   *********************************
15 random numbers between 0 and 99
88  40  3  5  58  43  35  81  91  21  34  69  43  5  37  

Number between 1 and 6 inclusive
5                                                   */