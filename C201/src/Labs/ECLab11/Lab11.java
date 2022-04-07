// The following program swaps two numbers using a function.
// Use it as an example to see
// how to sawp values of two variables through a function call.
/*
public class SwapNumberWithFunction
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("a=" + a + ",b=" + b);
 
        a = getB(b,b=a);
 
        System.out.println("a=" + a + ",b=" + b);
    }
     
    public static int getB(int x,int y)
    {
        return x;
    }
}
*/

public class Lab11
{
    public static void main(String[] args)
    {
	Integer m = 100;
	Integer n = -100;
	
        // your code goes here: call SwapValues to swap m and n        

	System.out.println("m = " + m); // m = -100
        System.out.println("n = " + n + "\n"); // n = 100


	Character grade_1 = 'A';
	Character grade_2 = 'D';
        
        // your code goes here: call SwapValues to swap grade_1 and grade_2

	System.out.println("grade 1 = " + grade_1); // grade 1 = D
        System.out.println("grade 2 = " + grade_2 + "\n"); // grade 2 = A

	String s1 = "Hello";
	String s2 = "Bye Bye";
        
        // your code goes here: call SwapValues to swap s1 and s2

	System.out.println("s1 = " + s1); // s1 = Bye Bye
        System.out.println("s2 = " + s2 + "\n"); // s2 = Hello


	int[] x = new int[3];
	int[] y = new int[3];
	for(int i=0; i<3; i++)
	{
            x[i] = 1;
            y[i] = -1;
	}

        // your code goes here: call SwapValues to swap x and y

	System.out.println("x[0] = " + x[0]); // x[0] = -1
        System.out.println("y[0] = " + y[0] + "\n"); // y[0] = 1
       
    }
    
    // Your code goes here
    // create a generic method SwapValues that can sawp
    // values of two parameters.

    
}
/*
A correctly implemented program should display:

m = -100
n = 100

grade 1 = D
grade 2 = A

s1 = Bye Bye
s2 = Hello

x[0] = -1
y[0] = 1
*/
