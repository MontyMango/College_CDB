/*  PROG22.JAVA

 Program randomly picks a number between 1 and 10, then has user
 try to guess what that number is. 
---------------------------------------------------------------------------*/
package Class_Examples;
import java.util.*;
public class prog22 
{ 
   public static void main(String[] args) 
   {
      Scanner Input = new Scanner(System.in);
      int ComputerNumber, UserGuess;
      
      ComputerNumber = (int)(Math.random()*10 + 1);
      
      do
      {     
         System.out.print("Please guess number between 1 and 10 --> ");
         UserGuess = Input.nextInt();

         if (ComputerNumber == UserGuess)
            System.out.println("Congratulations correct Guess");
         else if (UserGuess > ComputerNumber)
             System.out.println("Sorry, Guess is to High, Try again");
         else
             System.out.println("Sorry, Guess is to Low, Try Again");           

       } while (ComputerNumber != UserGuess);
              
   }
}
/* '*************************** output  *******************************
Please guess number between 1 and 10 --> 7
Sorry, Guess is to Low, Try Again
Please guess number between 1 and 10 --> 10
Sorry, Guess is to High, Try again
Please guess number between 1 and 10 --> 9
Congratulations correct Guess                                */