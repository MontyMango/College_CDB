package Labs;

/*
Name: Cameron Harter
Date: 9/1/2021
Lab 1
Part B

 */
import java.util.Scanner;

public class Lab1PartB 
{
    public static void main(String[] args)
    {
        int X, Y;
        
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter first number ");
        X = Input.nextInt();
        System.out.println("Enter second number ");
        Y = Input.nextInt();
        
        System.out.println("Sum = " + (X+Y));
    }
}
/*---------------------------------OUTPUT:--------------------------------------
Enter first number 
1
Enter second number 
2
Sum = 3
*/