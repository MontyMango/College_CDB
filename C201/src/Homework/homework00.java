public class homework00 {

	public static void main(String[] args)
	{
                          
	}
	
	// Question 1
	// This commented function uses a for loop to calculate the factorial of m;
	// rewrite this code using a while loop
	static int factorial(int m)
    {
		/*
		int result = 1;
		for(int i = 1; i<=m; i++)
		{
			result = result*i;
		}
		return result;
		*/
		
            int result = 1, i = 1;
            while (++i<=m)    {
                    result *= i;
            }
            return result;
		
	}
	
	//Question 2
	// Write this function to find the largest value of a two dimensional array and return it
	// must work for any legal array size and with any legal integer values
	public static int largest(int[][] ary)
	{
            int largest = 0;
            for (int[] ary1 : ary) {
                for (int nary2 = 0; nary2 < ary.length; nary2++) {
                    if (largest < ary1[nary2]) {
                        largest = ary1[nary2];
                    }
                }
            }
                return largest;
	}
	
	// Question 3
	// Write this function to compare two integer arrays. If the two arrays have the same size and contain exactly the same elements in the same Homework.Lab5.order
	// return true, otherwise return false
	public static boolean equal(int[] a, int[] b)
	{
            if (a.length != b.length)   {
                return false;
            }
            
            for (int num = 0; num < a.length; num++)    {
                    if (a[num] != b[num]) {
                        return false;
                    }
            }
            return true;
	}

	// Question 4
	// complete the following function to return the average value (mean) of a two dimensional integer array
	// (sum all numbers and divide by the total size)
	public static double average(int[][] ary)
	{
            int size = 0;
            double total = 0;
            for (int[] ary1 : ary) {
                for (int nary2 = 0; nary2 < ary.length; nary2++) {
                    total += ary1[nary2];
                    size++;
                }
            }
                total /= size;
                return total;
	}
	
}