/*
Name: Cameron Harter
Homework: 5
Problem: 3
Date: 9/28/2021

-------------------------------------------------------
	Source : H5_P3_CH.java

    This program records the number of even 
    numbers entered.
---------------------------------------------------------
 */
package Homework;

import java.util.Scanner;

public class H5_P3_CH {
    public static void main(String[] args) {
        // Declares integers
        int EvenTotal = 0, InputNumber;
        
        // Declares a new input scanner
        Scanner input = new Scanner(System.in);
        
        // Prints output that describes what the program
        // does and asks for a positive integer
        System.out.println("Program records the number "
                + "of even numbers entered.");
        System.out.print("Please enter positive integer, 0 to quit --> ");
        
        // Number input
        InputNumber = input.nextInt();
        
        // While the InputNumber isn't 0, keep on going
        while (InputNumber != 0)    {
            
            // If the number is even
            if (InputNumber % 2 == 0 )  {
                
                // Add one to the even number
                ++EvenTotal;
            }
            
            // Output asks the person to enter another positive integer or 0
            System.out.print("Please enter positive integer, 0 to quit --> ");
            
            // Number input
            InputNumber = input.nextInt();
        }
        
        // Output tells how much even numbers were entered
        System.out.println("User entered " + EvenTotal + " even numbers");
    }
}

/*
// Test 1
Program records the number of even numbers entered.
Please enter positive integer, 0 to quit --> 3
Please enter positive integer, 0 to quit --> 56
Please enter positive integer, 0 to quit --> 4
Please enter positive integer, 0 to quit --> 13
Please enter positive integer, 0 to quit --> 779
Please enter positive integer, 0 to quit --> 46
Please enter positive integer, 0 to quit --> 0
User entered 3 even numbers

// Test 2
Program records the number of even numbers entered.
Please enter positive integer, 0 to quit --> 1
Please enter positive integer, 0 to quit --> 2
Please enter positive integer, 0 to quit --> 3
Please enter positive integer, 0 to quit --> 4
Please enter positive integer, 0 to quit --> 5
Please enter positive integer, 0 to quit --> 6
Please enter positive integer, 0 to quit --> 7
Please enter positive integer, 0 to quit --> 8
Please enter positive integer, 0 to quit --> 9
Please enter positive integer, 0 to quit --> 0
User entered 4 even numbers

// Test 3
Program records the number of even numbers entered.
Please enter positive integer, 0 to quit --> 1000
Please enter positive integer, 0 to quit --> 900
Please enter positive integer, 0 to quit --> 800
Please enter positive integer, 0 to quit --> 700
Please enter positive integer, 0 to quit --> 600
Please enter positive integer, 0 to quit --> 500
Please enter positive integer, 0 to quit --> 400
Please enter positive integer, 0 to quit --> 300
Please enter positive integer, 0 to quit --> 200
Please enter positive integer, 0 to quit --> 100
Please enter positive integer, 0 to quit --> 0
User entered 10 even numbers
*/