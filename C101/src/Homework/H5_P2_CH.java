/*
Name: Cameron Harter
Homework: 5
Problem: 2
Date: 9/28/2021

-------------------------------------------------------
	Source : H5_P2_CH.java

    This program displays the first 40 fibonacci
    numbers and places 6 per line.
---------------------------------------------------------
 */
package Homework;

public class H5_P2_CH {
    public static void main(String[] args) {
        // Declares 
        int Number1 = 0, Number2 = 1, NumberCount = 2, Row = 0;
        
        System.out.println("This program displays the first 40 fibonacci"
                + " numbers and places 6 per line.");
        // First 2 Fibonacci numbers. This is why NumberCount starts at 2
        System.out.printf("%-10d",Number1); // 1st Fib Number
        System.out.printf("%-10d",Number2); // 2nd Fib Number
        
        // While the NumberCount isn't 6
        while(NumberCount != 6) {   // This will be 3 - 6 Fibonacci Numbers
            // Adds Number2 to Number1's total
            Number1 += Number2;
            
            // Display Number1 with 10 spaces to the right 
            System.out.printf("%-10d",Number1);
            
            // Add 1 to the NumberCount
            ++NumberCount;
            
            // Adds Number1 to Number2's total
            Number2 += Number1;
            
            // Display Number2 with 10 spaces to the right 
            System.out.printf("%-10d",Number2);
            
            // Add 1 to the NumberCount
            ++NumberCount;
        }
        
        // Makes a new line
        System.out.println();
        
        // While NumberCount is less than 40 | 7 - 40 Fibonacci Numbers
        while (NumberCount < 40)   {    
            
            // While the Row doesn't have 6 numbers 
            // and NumberCount is less than 40
            while ((Row != 6) && (NumberCount < 40))    {
                
            // Add the second number to the first number total
            Number1 += Number2;
            
            // Shows the first number
            System.out.printf("%-10d",Number1);
            
            // Adds one to the NumberCount and to the Row
            ++NumberCount;
            ++Row;
            
            // Adds the first number to the second number
            Number2 += Number1;
            
            // Shows the second number 
            System.out.printf("%-10d",Number2);
            
            // Adds one to the NumberCount and to the Row
            ++NumberCount;
            ++Row;
            }
            
            // Makes a new line so there's 6 every line
            System.out.println();
            
            // Reset the Row count to 0
            Row = 0;
        }
    }
}

/*
This program displays the first 40 fibonacci numbers 
and places 6 per line.

0         1         1         2         3         5  
8         13        21        34        55        89  
144       233       377       610       987       1597
2584      4181      6765      10946     17711     28657
46368     75025     121393    196418    317811    514229
832040    1346269   2178309   3524578   5702887   9227465
14930352  24157817  39088169  63245986  
*/