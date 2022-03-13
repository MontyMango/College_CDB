/*
Lab8.java

Name: Cameron Harter
 */
package Labs;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        int ConvertedNum = 0, Num;
        String NumStringInput;
        boolean Error = false;
        char LoopString;
        
        Scanner input = new Scanner(System.in);
        
       do {
            ConvertedNum = 0;
            System.out.print("Enter numeric string ");
            NumStringInput = input.nextLine();
            
            for(int lettercount = 0, num = 5; lettercount < NumStringInput.length(); ++lettercount)   {
                LoopString = NumStringInput.charAt(lettercount);
                if ( (LoopString >= '0') && (LoopString <= '9') )   {
                    Num = LoopString - '0';
                    ConvertedNum = ConvertedNum * 10 + Num;
                }
                else    {
                    Error = true;
                    System.out.println("Error in numeric string");
                    break;
                }
            }
            
            if (Error == false)  {
            System.out.println("Number is " + ConvertedNum + "\n");
            }
            
        } while(Error == false);
            
    }
}
/*
// Test 1 (Example)
Enter numeric string 1234
Number is 1234

Enter numeric string 123fd54
Error in numeric string

// Test 2 (Random numbers and then ....)
Enter numeric string 7624764
Number is 7624764

Enter numeric string 274674
Number is 274674

Enter numeric string 234073427
Number is 234073427

Enter numeric string ....
Error in numeric string
*/
