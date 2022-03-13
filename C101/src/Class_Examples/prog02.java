//              PROG02.JAVA
//
// This Java program declares and initializes three integer variables,
// then computes and displays the average of the three integers.
package Class_Examples;

public class prog02
{
   public static void main(String[] args) 
   {              
     int  First = 1,      // Declare 3 integers and initialize the first two
          Second = 2,     // to specific values.
          Third;          // All three could be declared on same line
     
     float Average;       // declare a real variable or floating point
     
     Third = 2;                        //assign a value to variable Third
     Average = (First + Second + Third)/3.0f; //f tells compiler treat as float
     
     System.out.println("\nThe average of " + First + ", " + Second + ", and "
                        + Third + " is " + Average + "\n");
    }
}
/*---------------------  Program Output  ---------------------------------

The average of 1, 2, and 2 is 1.6666666

************************** Program Comments ******************************
1) All variables used in Java must be declared.  They can be initialized
   anywhere in program before they are used, customary at beginning.

2) Names used for variables can begin with alphabetic character or underscore.
   Subsequent characters can also be numeric.  

3) Java is case sensitive, so "First" and "first" are different variable names

4) Java supports a wide variety of data types, see handout on Java Data Types

5) "=" is the assignment operator

6) Java uses "/" for both integer and floating point division, so use care
    For example:
      5/3.0  = 1.666667   but
      5/3    = 1          but
      5/float(3) = 1.666667 also

7) You can also type cast a number to different data type. More on this later

8) "\n" is used also for a newline                            */