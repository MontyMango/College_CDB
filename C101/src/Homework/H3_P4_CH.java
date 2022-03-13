package Homework;

/*
Name: Cameron Harter
Homework: 3
Problem: 2
Date: 9/16/2021

-------------------------------------------------------
	Source : H3_P1_CH.java

    This program is used to help you find the total,
    the sales tax, the total not taxed, and how much shirts
    you want.
---------------------------------------------------------
 */

import java.util.Scanner;

public class H3_P4_CH {
    public static void main(String[] args) {
        double TotalNotTaxed, SalesTax, Total, ShirtPrice;
        int InputShirts;
        
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter how much shirts you want? --> ");
        
        InputShirts = input.nextInt();
        
        if((InputShirts <= 10)&&(InputShirts > 4)) {
            ShirtPrice = 12.50;
        }
        else if(InputShirts > 10) {
            ShirtPrice = 8;
        }
        else {
            ShirtPrice = 15.75;
        }
        
        //Math
        TotalNotTaxed = InputShirts * ShirtPrice;
        SalesTax = .06 * TotalNotTaxed;
        Total = SalesTax + TotalNotTaxed;
        
        //Line 1
        System.out.printf("%-15s","Shirts");
        System.out.print("= ");
        System.out.println(InputShirts);
        
        //Line 2
        System.out.printf("%-15s","Price");
        System.out.print("= $");
        System.out.printf("%.2f %n",TotalNotTaxed);
        
        //Line 3
        System.out.printf("%-15s","Sales Tax");
        System.out.print("= $");
        System.out.printf("%.2f %n",SalesTax);
        
        //Line 4
        System.out.printf("%-15s","Total Price");
        System.out.print("= $");
        System.out.printf("%.2f %n",Total);
    }
}
/*
//Test 1 (9)
Enter how much shirts you want? --> 
9
Shirts         = 9
Price          = $112.50 
Sales Tax      = $6.75 
Total Price    = $119.25 

//Test 2 (16)
Enter how much shirts you want? --> 
16
Shirts         = 16
Price          = $128.00 
Sales Tax      = $7.68 
Total Price    = $135.68 

//Test 3 (24)
Enter how much shirts you want? --> 
24
Shirts         = 24
Price          = $192.00 
Sales Tax      = $11.52 
Total Price    = $203.52 
*/