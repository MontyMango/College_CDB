package Homework;

/*
Name: Cameron Harter
Homework: 3
Problem: 1
Date: 9/15/2021

-------------------------------------------------------
	Source : H3_P1_CH.java

    This program is used to help you sort which of the
    2 inputted numbers go first and second.
---------------------------------------------------------
*/

import java.util.Scanner;

public class H3_P1_CH {
    public static void main(String[] args) {
        int Num1, Num2;
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Program displays two numbers, largest first");
        System.out.println("Please enter first number");
        
        Num1 = Input.nextInt();
        
        System.out.println("Please enter the second number.");
        
        Num2 = Input.nextInt();
        
        if (Num1>Num2) {
        System.out.println("Two Numbers are, " +Num1 + " " + Num2);
        } else {
            System.out.println("Two Numbers are, " + Num2 + " " + Num1);
                
                }
        
    }
}
/*
// Test 1 (5, 3)
Program displays two numbers, largest first
Please enter first number
5
Please enter the second number.
3
Two Numbers are, 5 3

// Test 2 (7, 10)
Program displays two numbers, largest first
Please enter first number
7
Please enter the second number.
10
Two Numbers are, 10 7
*/