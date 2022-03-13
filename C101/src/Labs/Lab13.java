/*
Cameron Harter :)
 */

package Labs;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String NumInput;
        char response;
        
        int[] Total = new int [20];
        
        do {
            ZeroOutArray(Total);
            
            System.out.print("Please enter large number --> ");
            NumInput = input.nextLine();

            FillTotalArray(NumInput,Total);

            DisplayTotal(Total);
            
            System.out.println("\n");
            System.out.print("Continue \'Y\' or \'N\', response --> ");
            response = input.next().charAt(0);
            
        } while (response == 'Y');
    }
    
/* *********************** ZeroOutArray ******************************
Action : Fills the whole array with zeroes
Parameters: 
    Array[] - The imported array that will be zeroed out
Returns : None
---------------------------------------------------------------------*/
    static void ZeroOutArray(int Array[])   {
        for(int i = Array.length - 1; i >= 0; --i)  {
            Array[i] = 0;
        }
    }
    
/* *********************** FillTotalArray ******************************
Action : Fills the Total array from the input.
Parameters: 
    TA - Total array number in the array.
    SI - StringInput array number in the array.
    StrInput - The imported input that will be converted into TotalArray[].
    TotalArray[] - The coverted array.
Returns : None
---------------------------------------------------------------------*/
    static void FillTotalArray(String StrInput,int TotalArray[])    {
        int TA = TotalArray.length - 1, SI;
        
        for(SI = StrInput.length() - 1; SI >= 0; SI--)  {
            TotalArray[TA] = (int) StrInput.charAt(SI) - '0';
            --TA;
        }
    }
    
/* *********************** DisplayTotal ******************************
Action : Displays the Total array
Parameters: 
    i - Current number in the array
    Array[] - The imported Total array.
Returns : None
---------------------------------------------------------------------*/
    static void DisplayTotal(int Array[])   {
        System.out.println("Large twenty digit Number is");
        for(int i =0 ; i < Array.length ; i++) {
            System.out.print(Array[i]);
        }
    }
}
/*
Please enter large number --> 984567
Large twenty digit Number is
00000000000000984567

Continue 'Y' or 'N', response --> n
*/