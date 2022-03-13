package Homework.Lab5;

public class lab05
{
    public static void main(String[] args)
    {
        order a1 = new order(1001);
        product p1 = new product(9990, "iPhone", "Apple", 500);
        product p2 = new product(9990, "iPhone", "Apple", 500);
        product p3 = new product(8888, "printer", "Brother", 706);
        product p4 = new product(7777, "camera", "Silicon", 100);
        a1.addItem(p1);
        a1.addItem(p2);
        a1.addItem(p3);
        a1.addItem(p4);
        a1.checkStatus();
        System.out.println("Current cost is " + a1.getCost());
        a1.removeItem(p3);
        System.out.println("Current cost is " + a1.getCost());
        a1.finalizeOrder();
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
A correctly implemented program should display:

Order initiated!
Current cost is 1806.0
Current cost is 1100.0
Order placed!
Order paid!
Order shipped!
Order delivered!
*/