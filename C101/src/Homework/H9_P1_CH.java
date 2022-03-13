/*
Name: Cameron Harter
Homework: 9
Problem: 1
Date: 11/11/2021

-------------------------------------------------------
	Source : H9_P1_CH.java
    This program asks for a string of numbers, and the
    program will try to convert the string into an integer
    and returns either the integer if it was successful,
    if it wasn't successful, then an error will occur.
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H9_P1_CH {
    public static void main(String[] args) {
        char ContinueAnswer;
        String InputString;
        int IntResult;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("\nEnter a string of numbers --> ");
            InputString = input.nextLine();
            
            IntResult = ReadInt(InputString);
            
            switch (IntResult) {
                case -1:
                    System.out.println("An illegal entry has been entered.");
                    break;
                case -2:
                    System.out.println("An overflow error has occured");
                    break;
                default:
                    System.out.println(IntResult);
                    break;
            }
            
            System.out.print("\nWould you like to continue? Y/N --> ");
            ContinueAnswer = input.nextLine().charAt(0);
            
        } while (ContinueAnswer != 'n' && ContinueAnswer != 'N');
        
    }
    
/************************* ReadInt ****************************
Action: This method changes the inputted string into an 
integer, and will return an integer or an error.

Parameters: InputInt - The Input String, 
SelectedChar - A character that comes from the InputInt string,
ConvertedNum - The char that is converted into an integer,
Flag_Stop - Tells the for loop to stop, 
CharNum - The current character number on the String,
Total - The converted numbers that have been added together
Flag_Digit_Recorded - Flags when a digit has been entered
to tell that the entered item isn't illegal.
Flag_IllegalEntry - Flags if just a char has been entered
and has no digit before it.

Returns: An Integer

Preconditions: InputInt must be a String.
---------------------------------------------------------------*/
    static int ReadInt(String InputInt)  {
        char SelectedChar;
        int Total = 0;
        boolean Flag_IllegalEntry = false, Flag_Digit_Recorded = false;

        for(int ConvertedNum, Flag_Stop = 0,CharNum = 0 ;
                Flag_Stop != 1 && CharNum < InputInt.length(); CharNum++)    {
            SelectedChar = InputInt.charAt(CharNum);
            
            if (Character.isDigit(SelectedChar))   {
                ConvertedNum = SelectedChar - '0';
                Total *= 10;
                Total += ConvertedNum;
                
                Flag_Digit_Recorded = true;
            }
            
            else if (Character.isWhitespace(SelectedChar))  {
            }
            
            else  {
                Flag_Stop = 1;
                
                if (Flag_Digit_Recorded == false) {
                    Flag_IllegalEntry = true;
                }
                
            }
        }
        
        if (Flag_IllegalEntry == true)  {
            return -1;
        }
        else if (Total <= 65535 && Total >= 0)  {
            return Total;
        }
        else    {
            return -2;
        }
    }
}
/*
// Test 1 (Testing all switch-case outputs)

Enter a string of numbers --> 65535
65535

Would you like to continue? Y/N --> y

Enter a string of numbers --> 65536
An overflow error has occured

Would you like to continue? Y/N --> y

Enter a string of numbers --> hi
An illegal entry has been entered.

Would you like to continue? Y/N --> n


// Test 2

Enter a string of numbers --> 7+3=10
7

Would you like to continue? Y/N --> y

Enter a string of numbers --> 89plus27
89

Would you like to continue? Y/N --> y

Enter a string of numbers --> 90000 plus 60
An overflow error has occured

Would you like to continue? Y/N --> y

Enter a string of numbers --> negative 90
An illegal entry has been entered.

Would you like to continue? Y/N --> n


// Test 3 (0's)

Enter a string of numbers --> 0
0

Would you like to continue? Y/N --> y

Enter a string of numbers -->       0    n
0

Would you like to continue? Y/N --> y

Enter a string of numbers --> n0
An illegal entry has been entered.

Would you like to continue? Y/N --> y

Enter a string of numbers -->  0 0 0 0 0 0 0 0 y
0

Would you like to continue? Y/N --> n
*/