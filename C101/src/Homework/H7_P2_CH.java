/*
Name: Cameron Harter
Homework: 7
Problem: 2
Date: 10/25/2021

-------------------------------------------------------
	Source : H7_P2_CH.java
    This program asks for a number between 1 - 100 and takes
    the inputted number and determines if its an odd or even
    and yields the number from 1 to the inputted number.
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;


public class H7_P2_CH {
    public static void main(String[] args) {
        int InputNum, Total_Yield;
        String OddorEven;
        
        Scanner input = new Scanner(System.in);
        
        
        do {
            System.out.print("Enter a number between 1 - 100 --> ");
            InputNum = input.nextInt();
            
            if ((InputNum >= 1) && (InputNum <= 100))   {
                OddorEven = mod_by_two(InputNum);
                Total_Yield = Calculation(InputNum);

                System.out.println("Even or Odd: " + OddorEven);
                System.out.println("Yield: " + Total_Yield + "\n\n");
            }
        } while ((InputNum >= 1) && (InputNum <= 100));
    }
    
/************************* mod_by_two ****************************
Action: This method takes the inputted number and mods it by two
to determine if it's an odd or even number.
Parameters: N - Number, Result - The result, if the inputted number-
- is odd or even
Returns: Result
Preconditions: N must be an integer
---------------------------------------------------------------*/
    static String mod_by_two(int N) {
        String Result;
        
        if (N % 2 == 0) {
            Result = "Even";
        }
        else    {
            Result = "Odd";
        }
        return Result;
    }
    
/************************* Calculation ****************************
Action: This method takes the inputted number and mods it by two
to determine if it's an odd or even number.
Parameters: IN - Input Number, Total_Yield - The total yield that-
- is accumulated from the for loop.
Returns: Total_Yield
Preconditions: IN must be an integer
---------------------------------------------------------------*/
    static int Calculation(int IN)    {
        int Total_Yield = 0;
        
        for(int CurrentNum = 1; CurrentNum <= IN; ++CurrentNum)  {
            Total_Yield += CurrentNum;
        }
        
        return Total_Yield;
    }
    
}
/*
// Test 1 (Example)
Enter a number between 1 - 100 --> 4
Even or Odd: Even
Yield: 10


Enter a number between 1 - 100 --> 0


// Test 2 (Over 100)
Enter a number between 1 - 100 --> 100
Even or Odd: Even
Yield: 5050


Enter a number between 1 - 100 --> 101


// Test 3 ( 1 to 3 and then a negative number )
Enter a number between 1 - 100 --> 1
Even or Odd: Odd
Yield: 1


Enter a number between 1 - 100 --> 2
Even or Odd: Even
Yield: 3


Enter a number between 1 - 100 --> 3
Even or Odd: Odd
Yield: 6


Enter a number between 1 - 100 --> -3
*/