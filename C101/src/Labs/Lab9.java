/*
Lab8.java

Name: Cameron Harter
 */
package Labs;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        int InputInt1, InputInt2, Result;
        Scanner Input = new Scanner(System.in);
        
        do  
        {
            System.out.print("\n\nPlease enter two integers to subtract, same two to quit --> ");
            InputInt1 = Input.nextInt();
            InputInt2 = Input.nextInt();
            
            Result = Subtraction(InputInt1,InputInt2);
            
            System.out.println("The answer is " + Result);
            System.out.println("And expression is: ");
            
            if (Result >= 0) {
                PlusSign();
            }
            else    {
                MinusSign();
            }
            
            System.out.println("\n");
            
        } while(InputInt1 != InputInt2);
    }

/************************* Subtraction ****************************
Action: Method will subtract the first number and the second number
Parameters: Num1 - First Input Number, Num2 - Second Input Number
Returns: The subtraction of Num1 and Num2
Preconditions: Num1 and Num2 must be an integer
---------------------------------------------------------------*/
    static int Subtraction(int Num1, int Num2)    {
        return Num1-=Num2;
    }
    
    
    
    
/************************* PlusSign ****************************
Action: Method will print a plus sign.
Parameters: None
Returns: Nothing
Preconditions: None
---------------------------------------------------------------*/
    static void PlusSign()  {
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("*********");
        System.out.println("    *    ");
        System.out.println("    *    ");
    }
    
    
    
    
/************************* MinusSign ****************************
Action: Method will print a Minus sign.
Parameters: None
Returns: Nothing
Preconditions: None
---------------------------------------------------------------*/
    static void MinusSign() {
        System.out.println("************");
    }
    
}


/*


Please enter two integers to subtract, same two to quit --> 7 9
The answer is -2
And expression is: 
************


Please enter two integers to subtract, same two to quit --> 9 2
The answer is 7
And expression is: 
    *    
    *    
*********
    *    
    *    


Please enter two integers to subtract, same two to quit --> 0 0
The answer is 0
And expression is: 
    *    
    *    
*********
    *    
    *     
*/