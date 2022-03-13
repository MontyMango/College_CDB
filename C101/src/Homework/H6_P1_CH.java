/*
Name: Cameron Harter
Homework: 6
Problem: 1
Date: 10/17/2021

-------------------------------------------------------
	Source : H6_P1_CH.java
    This program simulates when you are given a penny
    and the amount doubles everyday.
---------------------------------------------------------
 */
package Homework;


public class H6_P1_CH {
    public static void main(String[] args) {
        System.out.println("Day\tAmount");
        System.out.println("----\t----------");
        
        for (int day = 1, pennies = 1; day <= 30; ++day) {
            System.out.println(day + "\t    " + pennies);
            pennies*=2;
            
        }
    }
}

/*
// Test 1
Day	Amount
----	----------
1	    1
2	    2
3	    4
4	    8
5	    16
6	    32
7	    64
8	    128
9	    256
10	    512
11	    1024
12	    2048
13	    4096
14	    8192
15	    16384
16	    32768
17	    65536
18	    131072
19	    262144
20	    524288
21	    1048576
22	    2097152
23	    4194304
24	    8388608
25	    16777216
26	    33554432
27	    67108864
28	    134217728
29	    268435456
30	    536870912
*/