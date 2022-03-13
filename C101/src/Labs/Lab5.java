package Labs;
/*
Lab5.java

Name: Cameron Harter

This program 
*/
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        // Declarations
        char InputYOrN;
        int InputInteger, PositiveNums = 0, NegativeNums = 0, Zeroes = 0;
        Scanner input = new Scanner(System.in);
        
        do  {
            System.out.print("Do you want to start Y/N ");
            InputYOrN = input.next().charAt(0);
            
            // If they input Y or y
            if ((InputYOrN == 'y')||(InputYOrN == 'Y'))   {
                System.out.print("Enter an integer ");
                InputInteger = input.nextInt();
                
                if(InputInteger > 0)    {
                    System.out.println("Positive\n");
                    ++PositiveNums;
                }
                else if (InputInteger < 0)  {
                    System.out.println("Negative\n");
                    ++NegativeNums;
                }
                else if (InputInteger == 0) {
                    System.out.println("Zero\n");
                    ++Zeroes;
                }
            }
        } 
        while((InputYOrN != 'N') && (InputYOrN != 'n'));
        
        System.out.println("Positive = " + PositiveNums);
        System.out.println("Negative = " + NegativeNums);
        System.out.println("Zeroes = " + Zeroes);
    }
}

/*
// Test 1
Do you want to start Y/N y
Enter an integer 6
Positive

Do you want to start Y/N y
Enter an integer 7
Positive

Do you want to start Y/N y
Enter an integer -5
Negative

Do you want to start Y/N y
Enter an integer 0
Zero

Do you want to start Y/N n
Positive = 2
Negative = 1
Zeroes = 1


// Test 2
Do you want to start Y/N y
Enter an integer 10
Positive

Do you want to start Y/N y
Enter an integer -0
Zero

Do you want to start Y/N y
Enter an integer -999
Negative

Do you want to start Y/N n
Positive = 1
Negative = 1
Zeroes = 1


// Test 3
Do you want to start Y/N y
Enter an integer 4
Positive

Do you want to start Y/N gh
Do you want to start Y/N d
Do you want to start Y/N s
Do you want to start Y/N a
Do you want to start Y/N h
Do you want to start Y/N b
Do you want to start Y/N v
Do you want to start Y/N y
Enter an integer 15
Positive

Do you want to start Y/N no
Positive = 2
Negative = 0
Zeroes = 0
*/