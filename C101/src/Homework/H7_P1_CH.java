/*
Name: Cameron Harter
Homework: 7
Problem: 1
Date: 10/27/2021

-------------------------------------------------------
	Source : H7_P1_CH.java
    This program asks to the user to input seconds. 
    The program coverts and displays the inputted 
    seconds into hours, minutes, and seconds.
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H7_P1_CH {
    public static void main(String[] args) {
        int InputSeconds;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Enter Total Seconds --> ");
            InputSeconds = input.nextInt();
            
            Calculation(InputSeconds);
            
        } while (InputSeconds != 0);
        
        

    }
    
/************************* Calculation ****************************
Action: This method divides the input seconds into hours, minutes, and seconds
Parameters: S - Input Seconds, Hours - Calculated Hours
Minutes - Calculated minutes, Seconds - Remainder Input Seconds
Returns: Nothing
Preconditions: S must be a integer
---------------------------------------------------------------*/
    static void Calculation(int S) {
        int Hours = 0, Minutes = 0;
        
        // Hours
        if (S >= 3600)    {
            Hours = S / 3600;
            S -= (Hours * 3600);
            System.out.print(Hours + ":");
        }
        
        // Minutes
        if ((S >= 60) || (Hours != 0))    {
            Minutes = S / 60;
            S -= (Minutes * 60);
            System.out.printf("%02d", Minutes);
            System.out.print(":");
        }
        
        // Seconds
        System.out.printf("%02d", S);
        System.out.println("\n");

    }
}
/*
// Test 1 (Example)
Enter Total Seconds --> 3605
1:00:05

Enter Total Seconds --> 0
00


// Test 2 (Following Zeroes Test)
Enter Total Seconds --> 600
10:00

Enter Total Seconds --> 500
08:20

Enter Total Seconds --> 40
40

Enter Total Seconds --> 2
02

Enter Total Seconds --> 0
00


// Test 3
run:
Enter Total Seconds --> 100000
27:46:40

Enter Total Seconds --> 10000
2:46:40

Enter Total Seconds --> 1000
16:40

Enter Total Seconds --> 100
01:40

Enter Total Seconds --> 10
10

Enter Total Seconds --> 1
01

Enter Total Seconds --> 0
00

*/