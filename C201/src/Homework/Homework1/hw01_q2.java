package Homework1;
public class hw01_q2
{
    public static void main(String[] args)
    {
        order a1 = new order(1001, "iPhone 11", 2, 1988);
        a1.checkStatus();
        a1.makePayment();
        a1.checkStatus();        
        a1.shipOrder();
        a1.checkStatus();        
        a1.deliverOrder();
        a1.checkStatus();             
    }
}

/*

If your program is implemented correctly,
it should display:

Order placed!
Order paid!
Order shipped!
Order delivered!

*/