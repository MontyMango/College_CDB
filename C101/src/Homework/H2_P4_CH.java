package Homework;

/*
Name: Cameron Harter
Date: 9/8/2021
Homework #: 2
Question #: 4
Source File: H2_P4_CH
 */
import java.util.Scanner;

public class H2_P4_CH {
    public static void main(String[] args)
    {
        double Salary, RetroactivePay, AnnualPay, MonthlyPay;
        
        Scanner Input = new Scanner(System.in);
                
        System.out.println("This computes your salary with a %7.6 increase. Shows the monthly, annual, and retroactive pay.");
        System.out.println("Please enter employee's salary -->");
        
        Salary = Input.nextDouble();
        
        RetroactivePay = .076 * Salary;
        AnnualPay = Salary + RetroactivePay;
        MonthlyPay = AnnualPay / 12;

        System.out.println("Retroactive Pay --> $" + RetroactivePay);
        System.out.println("New Annual Pay --> $" + AnnualPay);
        System.out.println("New Monthly Salary --> $" + MonthlyPay);

    }
}
/*
$35,000
This computes your salary with a %7.6 increase. Shows the monthly, annual, and retroactive pay.
Please enter employee's salary -->
35000
Retroactive Pay --> $2660.0
New Annual Pay --> $37660.0
New Monthly Salary --> $3138.3333333333335

$46,500
This computes your salary with a %7.6 increase. Shows the monthly, annual, and retroactive pay.
Please enter employee's salary -->
46500
Retroactive Pay --> $3534.0
New Annual Pay --> $50034.0
New Monthly Salary --> $4169.5

$52,450
This computes your salary with a %7.6 increase. Shows the monthly, annual, and retroactive pay.
Please enter employee's salary -->
52450
Retroactive Pay --> $3986.2
New Annual Pay --> $56436.2
New Monthly Salary --> $4703.016666666666
 */