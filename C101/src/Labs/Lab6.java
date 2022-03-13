package Labs;
/*
Lab6.java

Name: Cameron Harter
 */
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        int FirstNum, SecondNum, Total = 0, Total2 = 0, x;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Enter the first number ==> ");
        FirstNum = Input.nextInt();
        x = FirstNum;
        System.out.print("Enter the second number ==> ");
        SecondNum = Input.nextInt();
        
        
        while (FirstNum <= SecondNum)    {
            System.out.print(FirstNum + " ");
            Total += FirstNum;
            ++FirstNum;
        }
        
        System.out.println("= " + Total + " ");
        
        do    {
            System.out.print(x + " ");
            Total2 += x;
            ++x;
        }
        while (x <= SecondNum);
        
        
        System.out.print("= " + Total2 + " ");
    }
}

/*
Enter the first number ==> 9
Enter the second number ==> 3
3 4 5 6 7 8 9 = 42

Enter the first number ==> 3
Enter the second number ==> 21
3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 = 228

Enter the first number ==> 20
Enter the second number ==> 11
11 12 13 14 15 16 17 18 19 20 = 155

Enter the first number ==> 1
Enter the second number ==> 1
1 = 1
*/