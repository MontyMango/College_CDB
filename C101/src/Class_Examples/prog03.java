//              PROG03.JAVA
//
//  Introduces input and constants
//  Reads in a number then computes the area of circle

package Class_Examples;

import java.util.Scanner;   // needed to do input from keyboard

public class prog03
{
   public static void main(String[] args) 
   {

     final float PI = 3.14159f;    // constants are normally all uppercase
     float Radius;
     
     Scanner Input = new Scanner(System.in); // assigns variable for input    

     System.out.println("Enter the radius of the circle ==> ");
     Radius = Input.nextFloat();

     System.out.println("The area of the circle with radius " + Radius 
               + " is " + PI*Radius*Radius + "\n");
   }
 }

/*-------------------------  Program Output  ------------------------------

Enter the radius of the circle ==> 2
The area of the circle with radius 2 is 12.56636

***************************** program comments ***************************

1) The "final" tells compiler this variable does not change and value of PI 
   should not be changed, and any attempt to do so will result in a error 
   by compiler

2) import java.util.Scanner; is used at top of all programs to do keyboard 
   input. 

3) Scanner Input = new Scanner(System.in);  this assigns variable to be 
   used with input, this examples uses variable Input

4) Radius = Input.nextFloat();  Will read next float from input buffer and 
   store in variable Radius.        */