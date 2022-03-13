/*
Cameron 

Test: Doesn't work...
 */
package Personal_Tests;

import java.util.Scanner;

public class Reverse_The_Number_test {
    public static void main(String[] args) {
        int Num1, Num2, Num3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 3 numbers -->");
        Num1 = input.nextInt();
        Num2 = input.nextInt();
        Num3 = input.nextInt();
        
        System.out.println("The three numbers reversed are " + Num3 + Num2 + Num1);
    }
}
/*
Enter 3 numbers -->152
1
12
The three numbers reversed are 121152
*/