public class Lab06
{
    public static void main(String[] args)
    {
        for(int m=0; m<=3; m++)
        {
            for(int n=0; n<=12; n++)
            {
                System.out.println("Ackermann(" + m + ", " + n + ")=" + ackermann(m, n));
            }
        }
    }

    public static int ackermann(int m, int n)
    {
        int total = 0;
        // Implement the Ackermann function
        if (n >= 1) {
            return ackermann(m-1,ackermann(m, n - 1 ));
        }
        else if (m != 0 && n == 0) {
            return ackermann(m-1, n);
        }
        else  {
            total += n + 1;
            return total;
        }
        // Reference: https://en.wikipedia.org/wiki/Ackermann_function
    }
}
/*
A correctly implemented program should display

Ackermann(0, 0)=1
Ackermann(0, 1)=2
Ackermann(0, 2)=3
Ackermann(0, 3)=4
Ackermann(0, 4)=5
Ackermann(0, 5)=6
Ackermann(0, 6)=7
Ackermann(0, 7)=8
Ackermann(0, 8)=9
Ackermann(0, 9)=10
Ackermann(0, 10)=11
Ackermann(0, 11)=12
Ackermann(0, 12)=13
Ackermann(1, 0)=2
Ackermann(1, 1)=3
Ackermann(1, 2)=4
Ackermann(1, 3)=5
Ackermann(1, 4)=6
Ackermann(1, 5)=7
Ackermann(1, 6)=8
Ackermann(1, 7)=9
Ackermann(1, 8)=10
Ackermann(1, 9)=11
Ackermann(1, 10)=12
Ackermann(1, 11)=13
Ackermann(1, 12)=14
Ackermann(2, 0)=3
Ackermann(2, 1)=5
Ackermann(2, 2)=7
Ackermann(2, 3)=9
Ackermann(2, 4)=11
Ackermann(2, 5)=13
Ackermann(2, 6)=15
Ackermann(2, 7)=17
Ackermann(2, 8)=19
Ackermann(2, 9)=21
Ackermann(2, 10)=23
Ackermann(2, 11)=25
Ackermann(2, 12)=27
Ackermann(3, 0)=5
Ackermann(3, 1)=13
Ackermann(3, 2)=29
Ackermann(3, 3)=61
Ackermann(3, 4)=125
Ackermann(3, 5)=253
Ackermann(3, 6)=509
Ackermann(3, 7)=1021
Ackermann(3, 8)=2045
Ackermann(3, 9)=4093
Ackermann(3, 10)=8189
Ackermann(3, 11)=16381
Ackermann(3, 12)=32765

*/