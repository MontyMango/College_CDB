/*
Name: Cameron Harter
Homework: 5
Problem: 4
Date: 9/28/2021

-------------------------------------------------------
	Source : H5_P4_CH.java

    This problem has user enter number continually 
    until their sum is over 35.
---------------------------------------------------------
 */
package Homework;

import java.util.Scanner;

public class H5_P4_CH {
    public static void main(String[] args) {
        // Delcares integers
        int Total = 0, InputNumber;
        
        // Declares a new scanner input
        Scanner input = new Scanner(System.in);
        
        // Output tells what the program does and asks for the first number
        System.out.println("This problem has user enter number "
                + "continually until their sum is over 35");
        System.out.print("Enter first number --> ");
        
        // Number input
        InputNumber = input.nextInt();
        
        // Adds the number input to the total
        Total += InputNumber;
        
        // While the total is 35 or under
        while (Total <= 35)   {
            
            // Output asks for another number
            System.out.print("Enter another number --> ");
            
            // Number input
            InputNumber = input.nextInt();
            
            // Adds the input number to the total
            Total += InputNumber;
        }
        
        // Displays the total sum, and the last number that was inputted
        System.out.println("The sum is " + Total);
        System.out.println("The last number entered is " + InputNumber);
    }
}

/*
// Test 1
This problem has user enter number continually until their sum is over 35
Enter first number --> 1
Enter another number --> 2
Enter another number --> 3
Enter another number --> 4
Enter another number --> 5
Enter another number --> 6
Enter another number --> 7
Enter another number --> 8
The sum is 36
The last number entered is 8

// Test 2
This problem has user enter number continually until their sum is over 35
Enter first number --> 10
Enter another number --> 8
Enter another number --> 6
Enter another number --> 4
Enter another number --> 1
Enter another number --> 2
Enter another number --> 1
Enter another number --> 4
The sum is 36
The last number entered is 4

// Test 3
This problem has user enter number continually until their sum is over 35
Enter first number --> 6
Enter another number --> 2
Enter another number --> 3
Enter another number --> 1
Enter another number --> 5
Enter another number --> 3
Enter another number --> 8
Enter another number --> 4
Enter another number --> 9
The sum is 41
The last number entered is 9
*/