/*
Name: Cameron Harter
Homework: 4
Problem: 3
Date: 9/16/2021

-------------------------------------------------------
	Source : H4_P3_CH.java

    This program is used to help you find the day
    of the week based on the number that you put in
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H4_P3_CH {
    public static void main(String[] args) {
        // Declares strings and integers
        int InputNumber;
        String Day;
        
        // Makes a new scanner
        Scanner input = new Scanner(System.in);
        
        // User enters a number
        System.out.print("Enter number ");
        InputNumber = input.nextInt();
        
        // If the number is 8 or over or 0 or less than, print a message out.
        if((InputNumber >= 8)||(InputNumber <= 0))  {
            System.out.println("Number is out of range.");
        }
        // If the number is within 1 - 7
        else    {
            // Determines which number aligns with the day of the week.
            switch(InputNumber) {
                case 1: Day = "Sunday";
                break;
                case 2: Day = "Monday";
                break;
                case 3: Day = "Tuesday";
                break;
                case 4: Day = "Wednesday";
                break;
                case 5: Day = "Thursday";
                break;
                case 6: Day = "Friday";
                break;
                case 7: Day = "Saturday";
                break;
                default: Day = "Number out of range.";
                break;
            }  
            // Displays the day of the week.
            System.out.println("Today is " + Day);
            }
        }
    }

/*
// Test 1 (1)
Enter number 1
Today is Sunday

// Test 2 (7)
Enter number 7
Today is Saturday

// Test 3 (9)
Enter number 9
Number is out of range.
*/