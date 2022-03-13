package Labs;

/* Lab2.java

Name: Cameron Harter

This program has some missing code. Need to fill in the missing 
parts to solve following problem.

This program will have the user enter two integers and then 
display the number in reverse. For example, if enter 47 will 
display 74.  This number displayed needs to be one variable and 
not two.

 */
import java.util.Scanner; // Imported the Scanner from class util and the file java

public class Lab2 
{
    public static void main(String[] args) 
    {
        int Num, First, Second, Reverse;
        Scanner Input = new Scanner(System.in); // Declared a new Scanner named Input
        
        System.out.println("Enter a two digit integer "); Num = Input.nextInt(); 
        
         // Added a new input
        
        First = Num / 10;
        Second = Num % 10;
        
        Reverse = Second *10 + First;
        
        System.out.println("Reverse is " + Reverse);
        
    }    
}
/*
Enter a two digit integer 
47
Reverse is 74
 */