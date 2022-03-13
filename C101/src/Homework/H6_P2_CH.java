/*
Name: Cameron Harter
Homework: 6
Problem: 2
Date: 10/17/2021

-------------------------------------------------------
	Source : H6_P2_CH.java
    This program takes two inputted integers and an 
    inputted operand to display it's answer and integers.
---------------------------------------------------------
 */
package Homework;

import java.util.Scanner;

public class H6_P2_CH {

    public static void main(String[] args) {
        int InputNum1, InputNum2, Total;
        char InputOperand, InputContinue;

        Scanner Input = new Scanner(System.in);

        do {
            System.out.print("\nEnter first integer ==> ");
            InputNum1 = Input.nextInt();

            System.out.print("Enter second integer ==> ");
            InputNum2 = Input.nextInt();

            System.out.print("Enter an operand ==> ");
            InputOperand = Input.next().charAt(0);

            // Checks for which Operand the user inputted
            switch (InputOperand) {
                case '+':
                    Total = InputNum1 + InputNum2;
                    System.out.println(InputNum1 + " " + InputOperand + " "
                    + InputNum2 + " = " + Total);
                    break;
                case '-':
                    Total = InputNum1 - InputNum2;
                    System.out.println(InputNum1 + " " + InputOperand + " "
                    + InputNum2 + " = " + Total);
                    break;
                case '*':
                    Total = InputNum1 * InputNum2;
                    System.out.println(InputNum1 + " " + InputOperand + " "
                    + InputNum2 + " = " + Total);
                    break;
                case '/':
                    Total = InputNum1 / InputNum2;
                    System.out.println(InputNum1 + " " + InputOperand + " "
                    + InputNum2 + " = " + Total);
                    break;
                case '%':
                    Total = InputNum1 % InputNum2;
                    System.out.println(InputNum1 + " " + InputOperand + " "
                    + InputNum2 + " = " + Total);
                    break;
                default:
                    System.out.println("\nThe operand you inputted is not"
                            + " valid");
            }
            
            System.out.print("\nDo you want to continue? [Y/N] ==> ");
            InputContinue = Input.next().charAt(0);

        } while (InputContinue != 'N');
    }
}
/*
// Test 1 (Example test)

Enter first integer ==> 4
Enter second integer ==> 6
Enter an operand ==> +
4 + 6 = 10

Do you want to continue? [Y/N] ==> N



// Test 2 (Every operand test)

Enter first integer ==> 3
Enter second integer ==> 5
Enter an operand ==> +
3 + 5 = 8

Do you want to continue? [Y/N] ==> Y

Enter first integer ==> 2
Enter second integer ==> 8
Enter an operand ==> -
2 - 8 = -6

Do you want to continue? [Y/N] ==> Y

Enter first integer ==> 4
Enter second integer ==> 7
Enter an operand ==> *
4 * 7 = 28

Do you want to continue? [Y/N] ==> Y

Enter first integer ==> 3
Enter second integer ==> 2
Enter an operand ==> /
3 / 2 = 1

Do you want to continue? [Y/N] ==> Y

Enter first integer ==> 7
Enter second integer ==> 2
Enter an operand ==> %
7 % 2 = 1

Do you want to continue? [Y/N] ==> N



// Test 3 (Not valid operand test)

Enter first integer ==> 15
Enter second integer ==> 9
Enter an operand ==> ^

The operand you inputted is not valid

Do you want to continue? [Y/N] ==> Y

Enter first integer ==> 4
Enter second integer ==> 3
Enter an operand ==> $

The operand you inputted is not valid

Do you want to continue? [Y/N] ==> N
*/
