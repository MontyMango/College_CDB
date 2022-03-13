package Homework;



/* 	
Name: Cameron Harter
Date: 9/8/2021
Homework #: 2
Question #: 1
Source File: H2_P1_CH
 */
import java.util.Scanner;

public class H2_P1_CH {
    public static void main(String[] args)
    {
        int Angle1, Angle2, Angle3;
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("This will calculate the third angle of a triangle.");
        System.out.println("Enter the first angle");
        Angle1 = Input.nextInt();
        System.out.println("Enter the second angle");
        Angle2 = Input.nextInt();
        
        Angle3 = 180 - Angle1 - Angle2;
        System.out.println("The third angle is " + Angle3 + " degrees.");
    }
    
}

/*
// Test 1 (70 35)
This will calculate the third angle of a triangle.
Enter the first angle
70
Enter the second angle
35
The third angle is 75 degrees.

// Test 2 (26 56)
This will calculate the third angle of a triangle.
Enter the first angle
26
Enter the second angle
56
The third angle is 98 degrees.
 */
