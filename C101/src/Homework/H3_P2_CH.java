package Homework;

/*
Name: Cameron Harter
Homework: 3
Problem: 2
Date: 9/16/2021

-------------------------------------------------------
	Source : H3_P2_CH.java

    This program is used to help you find if the
    inputted year is a leap year or not.
---------------------------------------------------------
 */

import java.util.Scanner;
        
public class H3_P2_CH {
    public static void main(String[] args) {
        int InputYear;
        System.out.println("This computes and sees if the year that you put in is a leap year.");
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Put in a year to see if it's a leap year.");
            InputYear = input.nextInt();
        }
        while(InputYear < 0);
        
        if(InputYear % 400 == 0){
            System.out.println(InputYear + " is a leap year!");
        }
        else if((InputYear % 4 == 0)&&(InputYear % 100 != 0)) {
            System.out.println(InputYear + " is a leap year!");
        }
        else {
            System.out.println(InputYear + " isn't a leap year.");
        }
    }
}
/*
// Test 1 (2020)
This computes and sees if the year that you put in is a leap year.
Put in a year to see if it's a leap year.
2020
2020 is a leap year!

// Test 2 (2021)
This computes and sees if the year that you put in is a leap year.
Put in a year to see if it's a leap year.
2021
2021 isn't a leap year.

// Test 3 (199)
This computes and sees if the year that you put in is a leap year.
Put in a year to see if it's a leap year.
199
199 isn't a leap year.
*/