/*
Name: Cameron Harter
Homework: 10
Problem: 1
Date: 12/6/2021

-------------------------------------------------------
	Source : H10_P1_CH.java
    This program asks for two strings of numbers, and
    then converts them both into an array. They are both
    added together and then the two array numbers and 
    the total will be displayed.
---------------------------------------------------------
 */
package Homework;
import java.util.Scanner;

public class H10_P1_CH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String NumberArray1, NumberArray2;
        char response;
        
        int[] Sum = new int[20];
        int[] ArrayNum1 = new int[20];
        int[] ArrayNum2 = new int[20];
        
        System.out.println("Program will add two large numbers\n");
        
        do  {
            
            System.out.print("Please enter first number --> ");
            NumberArray1 = input.nextLine();
            System.out.print("Please enter second number --> ");
            NumberArray2 = input.nextLine();
            
            CovertToArray(NumberArray1, ArrayNum1);
            CovertToArray(NumberArray2, ArrayNum2);
            
            AddTwoNumbers(ArrayNum1, ArrayNum2, Sum);
            DisplayResult(ArrayNum1, ArrayNum2, Sum);
            ZeroOutArrays(ArrayNum1, ArrayNum2, Sum);
            
            System.out.print("\n\nContinue \'Y\' or \'N\' --> ");
            response = input.nextLine().charAt(0);
            
            System.out.print("\n");
            
        } while(response == 'Y' || response == 'y');
        
    }
    
/* *********************** ZeroOutArray ******************************
Action : Fills the whole array with zeroes
Parameters: 
    Array[] - The imported array that will be zeroed out
Returns : None
Preconditions: Array1, Array2, and Array3 must be integer Arrays
---------------------------------------------------------------------*/
    static void ZeroOutArrays(int Array1[], int Array2[], int Array3[])   {
        for(int i = Array1.length - 1; i >= 0; i--)  {
            Array1[i] = 0;
            Array2[i] = 0;
            Array3[i] = 0;
        }
    }
    
/************************* CovertToArray ****************************
Action: This method will covert the strings into integer arrays
Parameters: 
    Numbers - The imported string of input numbers
    Array - The imported array
    NumberChar - The current number on the String Numbers
    ArrayNum - The current number on the integer array Array

Returns: None

Preconditions: Numbers must be a String and Array must be an integer Array
---------------------------------------------------------------*/
    static void CovertToArray(String Numbers, int Array[])  {
        char NumberChar;
        for(int i = Numbers.length() - 1, ArrayNum = 19;
                i >= 0; i--, ArrayNum--)  {
            
            NumberChar = Numbers.charAt(i);
            
            if (Character.isDigit(NumberChar))  {
                Array[ArrayNum] = (int) NumberChar - '0';
            }
            else if (Character.isWhitespace(NumberChar))    {
                ArrayNum+=1;
            }
        }
    }
/************************* AddTwoNumbers ****************************
Action: This method will add the two number array.

Parameters: 
    Carry - When the total number is over 10
    ArrayNum - The current number that the array is on
    FirstNumber - Imported first number array
    SecondNumber - Imported second number array
    Sum - The total array

Returns: None

Preconditions: FirstNumber, SecondsNumber, and Sum must be integer Arrays
---------------------------------------------------------------*/
    static void AddTwoNumbers(int FirstNumber[], 
            int SecondNumber[], int Sum[])
    {
        int Carry = 0;
        for(int ArrayNum = 19; ArrayNum >= 0; ArrayNum--)   {
            
            Sum[ArrayNum] = 
                    (SecondNumber[ArrayNum] + FirstNumber[ArrayNum]) % 10;
            
            if (Carry > 0) {
                Sum[ArrayNum]+=Carry;
                Carry = 0;
            }
            
            Carry = (SecondNumber[ArrayNum] + FirstNumber[ArrayNum]) / 10;
        }
    }
    
/************************* DisplayResult ****************************
Action: This method will display the array numbers and the total.

Parameters:
    Number1 - Imported first number array
    Number2 - Imported second number array
    Total - Imported total array that shows the total

Returns: None

Preconditions: Number1, Number2, and Total must be integer Arrays
---------------------------------------------------------------*/
    static void DisplayResult(int Number1[], int Number2[], int Total[]) {
        for(int Num = 0; 19 >= Num; Num++)   {
            System.out.print(Number1[Num]);
        }
        System.out.println("");
        for(int Num = 0; 19 >= Num; Num++)   {
            System.out.print(Number2[Num]);
        }
        System.out.println("\n--------------------");
        for(int Num = 0; 19 >= Num; Num++)   {
            System.out.print(Total[Num]);
        }
    }
}
/*
// Test 1 (Example)
Program will add two large numbers

Please enter first number --> 8764
Please enter second number --> 98
00000000000000008764
00000000000000000098
--------------------
00000000000000008862

Continue 'Y' or 'N' --> n



// Test 2 (Checking the max)
Program will add two large numbers

Please enter first number --> 99999999999999999999
Please enter second number --> 99999999999999999999
99999999999999999999
99999999999999999999
--------------------
99999999999999999998

Continue 'Y' or 'N' --> n



// Test 3 (Random Numbers)
Program will add two large numbers

Please enter first number --> 739483
Please enter second number --> 938284
00000000000000739483
00000000000000938284
--------------------
00000000000001677767

Continue 'Y' or 'N' --> y

Please enter first number --> 000000
Please enter second number --> 000000
00000000000000000000
00000000000000000000
--------------------
00000000000000000000

Continue 'Y' or 'N' --> y

Please enter first number --> 10000734
Please enter second number --> 029394
00000000000010000734
00000000000000029394
--------------------
000000000000100210128

Continue 'Y' or 'N' --> n

*/