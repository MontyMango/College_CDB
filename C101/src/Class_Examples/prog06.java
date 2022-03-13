//              PROG06.JAVA
//
//  This program introduces Java If statements.  

package Class_Examples;
import java.util.Scanner;

public class prog06 
{
  public static void main(String[] args) 
   {
     int First, Second;
     Scanner Input = new Scanner(System.in); 

     System.out.println("Enter two integers and then press Enter Key  ==> ");
     First = Input.nextInt();
     Second = Input.nextInt();
       
     if (First > Second)
        System.out.println(First + " is the largest.");
     else if (Second > First)
        System.out.println(Second + " is the largest.");
     else
     {
        System.out.println("The numbers are equal.");
     } // these {} are not required here

   }
}

/*-------------------------  Program Output  ----------------------------

Enter two integers and then press Enter Key ==> 3 8
8 is the largest

*************************** Program Comments ****************************
1) The Java if-else statements work in the expected manner and are similiar to
   most other languages.

2) The logical expression that follows the reserved word "if" must be enclosed
   in paranthesis.

3) Note that a semicolon always terminates the statement that precedes an else

4) If you only have one statement for an expression to execute if it is true
   then the {} are not needed. If there is more than one statement, the {}
   are then required to form a compound statement.          */