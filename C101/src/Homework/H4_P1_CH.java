/*
Name: Cameron Harter
Homework: 4
Problem: 1
Date: 9/16/2021

-------------------------------------------------------
	Source : H4_P1_CH.java

    This program is used to help you determine your
    GPA, based on taking two classes.
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H4_P1_CH {
    public static void main(String[] args) {
        // Declares new
        char Class1Grade, Class2Grade;
        int Class1Credit, Class2Credit, Class1GradeScore, Class2GradeScore,
                Total_Credits;
        float GPA, Total_Points;
        
        // New Scanner
        Scanner input = new Scanner(System.in);
        
        // This tells what the program does (Intro)
        System.out.println("This program calculates your GPA based on your "
                + "letter grade and credit hours");
        System.out.println("Please do not use plus or minuses for your grade"
                + " (Ex. Put A instead of A+)\n");
        
        // Asks for Class1Grade (first letter grade)
        System.out.print("Enter letter grade for first class --> ");
        Class1Grade = input.next().charAt(0);
        
        // Asks for Class1Credit (first class credit hours)
        System.out.print("Enter number of credit hours for first class --> ");
        Class1Credit = input.nextInt();
        
        
        // Asks for Class2Grade (second letter grade)
        System.out.print("\n\nEnter letter grade for second class --> ");
        Class2Grade = input.next().charAt(0);
        
        // Asks for Class2Credit (second class credit hours)
        System.out.print("Enter number of credit hours for the second class "
                + "--> ");
        Class2Credit = input.nextInt();
        
        // Checks the grade for the first class
        switch (Class1Grade) {
            case 'A':
                Class1GradeScore = 4;
                break;
            case 'B':
                Class1GradeScore = 3;
                break;
            case 'C':
                Class1GradeScore = 2;
                break;
            case 'D':
                Class1GradeScore = 1;
                break;
            default: // Default is F
                Class1GradeScore = 0;
                break;
        }
        
        // Checks the grade for the second class
        switch (Class2Grade) {
            case 'A':
                Class2GradeScore = 4;
                break;
            case 'B':
                Class2GradeScore = 3;
                break;
            case 'C':
                Class2GradeScore = 2;
                break;
            case 'D':
                Class2GradeScore = 1;
                break;
            default: // Default is F
                Class2GradeScore = 0;
                break;
        }

        // Multiplies the credit and scores, and then adds them to get 
        // the total points
        Total_Points = (Class1Credit * Class1GradeScore) + 
                (Class2Credit * Class2GradeScore);
        
        // Adds the Class Credit Hours together
        Total_Credits = Class1Credit + Class2Credit;
        
        // Divides the Total_Points with Total_Credits to get the GPA.
        GPA = Total_Points / Total_Credits;
        
        // Displays GPA
        System.out.println("Your GPA = " + GPA);
        
        // Determines which message to put up
        if(GPA >= 3.5) {
            System.out.println("Congratulations, doing good");   
        }
        else {
            System.out.println("You are doing poorly");
        }

    }
}
/*
// Test 1 (A 3 B 4)
This program calculates your GPA based on your letter grade and credit hours
Please do not use plus or minuses for your grade (Ex. Put A instead of A+)

Enter letter grade for first class --> A
Enter number of credit hours for first class --> 3


Enter letter grade for second class --> B
Enter number of credit hours for the second class --> 4
Your GPA = 3.4285715
You are doing poorly


// Test 2 (B 3 A 4)
This program calculates your GPA based on your letter grade and credit hours
Please do not use plus or minuses for your grade (Ex. Put A instead of A+)

Enter letter grade for first class --> B
Enter number of credit hours for first class --> 3


Enter letter grade for second class --> A
Enter number of credit hours for the second class --> 4
Your GPA = 3.5714285
Congratulations, doing good


// Test 3 (D 3 C 3)
This program calculates your GPA based on your letter grade and credit hours
Please do not use plus or minuses for your grade (Ex. Put A instead of A+)

Enter letter grade for first class --> D
Enter number of credit hours for first class --> 3


Enter letter grade for second class --> C
Enter number of credit hours for the second class --> 3
Your GPA = 1.5
You are doing poorly
*/