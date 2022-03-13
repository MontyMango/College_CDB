package Homework1;

public class hw01_q1
{
    public static void main(String[] args)
    {
        account a1 = new account(1001, "John", "Smith");
        a1.deposit(1000);
        a1.withdraw(55);
        a1.deposit(2000);
        a1.printBalance();
    }
}

/*

If your program implemented correctly,
it should display:

available balance is $2945.0

*/
