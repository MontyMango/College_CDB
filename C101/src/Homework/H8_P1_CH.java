/*
Name: Cameron Harter
Homework: 8
Problem: 1
Date: 11/3/2021

-------------------------------------------------------
	Source : H8_P1_CH.java
    This program asks for the principal, annual interest rate,
    the number of years, and the number of payments per year to
    calculate monthly payment information.
---------------------------------------------------------
 */
package Homework;

import java.util.*;

public class H8_P1_CH {

    public static void main(String[] args) {
        float Principal, Rate, MonthlyPay;
        int Years, Period;
        char YorN;
        
        Scanner input = new Scanner(System.in);

        do {
        
            System.out.print("Principal --> ");
            Principal = input.nextFloat();

            System.out.print("Annual Interest Rate --> ");
            Rate = input.nextFloat();

            System.out.print("Number of Years --> ");
            Years = input.nextInt();

            System.out.print("# of payments per year --> ");
            Period = input.nextInt();

            MonthlyPay = MonthlyPayment(Principal, Rate, Years, Period);

            Show_Table(Principal, Rate, MonthlyPay, Years, Period);

            System.out.print("\n\nWould you like to calculate another "
                    + "loan?\n[Y/N]--> ");
            YorN = input.next().charAt(0);
            
            System.out.println("\n");
        
        } while (Character.toUpperCase(YorN) != 'N');
        

    }

/************************* MonthlyPayment ****************************
Action: This method calculates the Monthly Payment.

Parameters: Principal - The amount of dollars that being lent, 
AnnualRate - Total interest, PaymentYears - The number of years, 
PaymentPeriods - Number of payments per year.
 
Returns: Monthly - Monthly total
 
Preconditions: Principal, and AnnualRate, have to be a float, 
while PaymentYears, and PaymentPeriods must be an integer.
---------------------------------------------------------------*/
    static float MonthlyPayment(float Principal, float AnnualRate,
            int PaymentYears, int PaymentPeriods) {
        float Monthly, Interest_Rate, term;

        AnnualRate /= 100;
        Interest_Rate = AnnualRate / 12;
        term = PaymentYears * PaymentPeriods;

        Monthly = (float) (Principal
                * (Interest_Rate / (1 - Math.pow((Interest_Rate + 1),
                        -term))));

        
        return Monthly;
    }

/************************* Show_Table ****************************
Action: This method shows information about monthly payments.

Parameters: Principal - The amount of dollars that being lent, 
AnnualRate - Total interest, PaymentYears - The number of years, 
PaymentPeriods - Number of payments per year
MonthlyPay - Pay that is paid monthly

Returns: Nothing

Preconditions: Principal, AnnualRate, and MonthlyPay has to be a 
float, while PaymentYears, and PaymentPeriods must be an integer.
---------------------------------------------------------------*/
    static void Show_Table(float Principal, float AnnualRate,
            float MonthlyPay, int PaymentYears, int PaymentPeriods) {
        System.out.println("\n");
        
        System.out.printf("%-18s","Principal");
        System.out.print("$");
        System.out.printf("%.2f %n",Principal);
        
        System.out.printf("%-18s","Interest Rate");
        System.out.printf("%.2f",AnnualRate);
        System.out.print("%\n");
        
        System.out.printf("%-18s","No. of Years");
        System.out.println(PaymentYears);
        
        System.out.printf("%-18s","Payments Per Year");
        System.out.println(PaymentPeriods);
        
        System.out.printf("%-18s","No. of Payments");
        System.out.println(PaymentYears * PaymentPeriods);
        
        System.out.printf("%-18s","Monthly Payment");
        System.out.print("$");
        System.out.printf("%.2f %n",MonthlyPay);
    }
}
/*
// Test 1 (Example)
Principal --> 11000
Annual Interest Rate --> 10
Number of Years --> 4
# of payments per year --> 12


Principal         $11000.00 
Interest Rate     10.00%
No. of Years      4
Payments Per Year 12
No. of Payments   48
Monthly Payment   $278.99 


Would you like to calculate another loan?
[Y/N]--> y


Principal --> 15500
Annual Interest Rate --> 5.70
Number of Years --> 5
# of payments per year --> 12


Principal         $15500.00 
Interest Rate     5.70%
No. of Years      5
Payments Per Year 12
No. of Payments   60
Monthly Payment   $297.50 


Would you like to calculate another loan?
[Y/N]--> y


Principal --> 115000
Annual Interest Rate --> 7.75
Number of Years --> 30
# of payments per year --> 12


Principal         $115000.00 
Interest Rate     7.75%
No. of Years      30
Payments Per Year 12
No. of Payments   360
Monthly Payment   $823.88 


Would you like to calculate another loan?
[Y/N]--> n





// Test 2 (Random Change Test)
Principal --> 11000.65
Annual Interest Rate --> 7.56
Number of Years --> 3
# of payments per year --> 12


Principal         $11000.65 
Interest Rate     7.56%
No. of Years      3
Payments Per Year 12
No. of Payments   36
Monthly Payment   $342.49 


Would you like to calculate another loan?
[Y/N]--> y


Principal --> 6548.12
Annual Interest Rate --> 9.22
Number of Years --> 12
# of payments per year --> 6


Principal         $6548.12 
Interest Rate     9.22%
No. of Years      12
Payments Per Year 6
No. of Payments   72
Monthly Payment   $118.75 


Would you like to calculate another loan?
[Y/N]--> n





// Test 3
Principal --> 15000
Annual Interest Rate --> 9.26
Number of Years --> 36
# of payments per year --> 1


Principal         $15000.00 
Interest Rate     9.26%
No. of Years      36
Payments Per Year 1
No. of Payments   36
Monthly Payment   $478.81 


Would you like to calculate another loan?
[Y/N]--> y


Principal --> 30000
Annual Interest Rate --> 10.25
Number of Years --> 26
# of payments per year --> 3


Principal         $30000.00 
Interest Rate     10.25%
No. of Years      26
Payments Per Year 3
No. of Payments   78
Monthly Payment   $528.44 


Would you like to calculate another loan?
[Y/N]--> n


*/
