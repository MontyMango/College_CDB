/*       Program  PROG11.JAVA

   Action :  This problem will find the left most digit of an integer. This is done 
             two ways. One with a do-while loop and the other with a while loop. They 
             appear to both work, however it testing is done correctly will see that the 
             do-while loop is not logically correct. 
------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;

public class prog11 
{
  public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int N, R1, R2;
      
      System.out.print("Enter number to find left most digit ");
      N = Input.nextInt();
      R1 = R2 = N;
      
      do                // uses do-while loop to find left most digit
         R1 = R1/10;
      while (R1 > 10);
      
      while (R2 >= 10) // uses while loop to find left most digit
         R2 = R2/10;
      
      System.out.println("\nDo-while reversed is    " + R1);
      System.out.println("While-Loop reversed is  " + R2);        
   }   
}
/********************************** output **************************
Enter number to find left most digit 458

Do-while reversed is    4
While-Loop reversed is  4           appears to work

Enter number to find left most digit 63

Do-while reversed is    6
While-Loop reversed is  6           appears to work

Enter number to find left most digit 3

Do-while reversed is    0
While-Loop reversed is  3           do-while loop does not work

Enter number to find left most digit 100

Do-while reversed is    10
While-Loop reversed is  1          again, do-while loop does not work */
