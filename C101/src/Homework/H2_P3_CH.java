package Homework;

/*
Name: Cameron Harter
Date: 9/8/2021
Homework #: 2
Question #: 3
Source File: H2_P3_CH
 */
import java.util.Scanner;

public class H2_P3_CH {
     public static void main(String[] args)
    {
        int Seconds, Minutes, Days, Hours, LeftOver;
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Compute the number of days, hours, minutes and seconds from total seconds entered.");
        System.out.println("Enter the total number of Seconds");
        
        Seconds = Input.nextInt();
        
        Days = Seconds / 86400;
        LeftOver = Seconds % 86400;
        
        Hours = LeftOver / 3600;
        LeftOver = LeftOver % 3600;
        
        Minutes = LeftOver / 60;
        Seconds = LeftOver % 60;
        
        System.out.println("There are " + Days + " Days," + Hours + " Hours, " + Minutes + " Minutes and " + Seconds + " Seconds.");       
    }
}

/*
Compute the number of days, hours, minutes and seconds from total seconds entered.
Enter the total number of Seconds
10000
There are 0Days,2 Hours, 46 Minutes and 40 Seconds.
 */