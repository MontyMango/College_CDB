package Homework;

/*
Name: Cameron Harter
Homework: 3
Problem: 3
Date: 9/16/2021
-------------------------------------------------------
	Source : H3_P3_CH.java

    This program is used to help you find the multiplied
    input and the remainder and whole division of the input.
---------------------------------------------------------
 */

import java.util.Scanner;

public class H3_P3_CH {
    public static void main(String[] args) {
        int Integer1, Integer2, TotalMultiplied, WholeNum, Remainder;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two integers between -180 and 180 -->");
        
        do {
            Integer1 = input.nextInt();
            Integer2 = input.nextInt();
        }
        while(((Integer1 < -180)||(Integer1 > 180))&&((Integer2 < -180)||(Integer2 > 180)));
        
        //Multiplication
        TotalMultiplied = Integer1 * Integer2;
        
        //Division
        WholeNum = Integer1 / Integer2;
        Remainder = Integer1 % Integer2;
        
        
        //Make a newline so the output looks great
        System.out.println("\n");
        
        //Line 1
        System.out.printf("%4d", Integer1);
        System.out.printf("%10d", WholeNum);
        System.out.printf("%s"," R");
        System.out.printf("% d %n", Remainder);
        
        // Line 2
        System.out.printf("%s", "x");
        System.out.printf("%3d", Integer2);
        System.out.printf("%15s %n", "_______");
        
        //Line 3
        System.out.printf("%s","-----");
        System.out.printf("%6d", Integer2);
        System.out.printf("%s", "|");
        System.out.printf("%d %n", Integer1);
        
        //Line 4
        System.out.printf("%1d %n", TotalMultiplied);
        
            
    }
}
/*
// Test 1 (125, 34)
Enter two integers between -180 and 180 -->
125 34


 125         3 R 23 
x 34        _______ 
-----    34|125 
4250 


// Test 2 (157, 16)
Enter two integers between -180 and 180 -->
157 16


 157         9 R 13 
x 16        _______ 
-----    16|157 
2512 
*/