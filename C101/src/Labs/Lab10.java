/*
Lab10.java

Name: Cameron Harter
 */
package Labs;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        int InputNum1, InputNum2, InputNum3, TopNum;
        char ContinueInput;
        
        Scanner input = new Scanner(System.in);
        
        do {
        
            System.out.print("\nInsert 1st number --> ");
            InputNum1 = input.nextInt();

            System.out.print("Insert 2nd number --> ");
            InputNum2 = input.nextInt();

            System.out.print("Insert 3rd number --> ");
            InputNum3 = input.nextInt();

            TopNum = LargestNumber(InputNum1, InputNum2, InputNum3);

            System.out.println("\nThe Largest Number that you inputted was " + TopNum);
            System.out.print("\nWould you like to enter another insert more numbers?\n[Y/N] --> ");
            
            ContinueInput = input.next().charAt(0);
            
        } while (Character.toUpperCase(ContinueInput) != 'N');
        
    }
    
/************************* LargestNumber ****************************
Action: Method will find the largest number from three numbers

Parameters: Number1 - First Input Number, Number2 - Second Input Number
Number3 - Third Input Number

Returns: The largest number

Preconditions: Number1, Number2, and Number3 must be an integer
---------------------------------------------------------------*/
    static int LargestNumber (int Number1, int Number2, int Number3) {
        if (Number1 > Number2 && Number1 > Number3) {
            return Number1;
        }
        else if (Number2 > Number1 && Number2 > Number3)    {
            return Number2;
        }
        else    {
            return Number3;
        }
    }
}
/*
Insert 1st number --> 1
Insert 2nd number --> 2
Insert 3rd number --> 3

The Largest Number that you inputted was 3

Would you like to enter another insert more numbers?
[Y/N] --> n

*/