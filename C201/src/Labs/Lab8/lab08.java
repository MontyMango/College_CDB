package Lab8;
public class lab08
{
    public static void main(String[] args)
    {
        onlineOrder a1 = new onlineOrder(1001, "someone@yahoo.com");
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
        a1.makePayment();
        a1.shipOrder();
        a1.deliverOrder();
        System.out.print("Notify " + a1.get_email() + " : ");
        a1.checkStatus();
        
        phoneOrder a2 = new phoneOrder(2002, "574-321-8765");
        product pp1 = new product(9990, "iPhone", "Apple", 500);
        product pp2 = new product(7777, "camera", "Silicon", 100);
        a2.addItem(pp1);
        a2.addItem(pp2);

        a2.finalizeOrder();
        a2.makePayment();
        a2.shipOrder();
        a2.deliverOrder();
        System.out.print("Notify " + a2.get_phone() + " : ");
        a2.checkStatus();
        
        storeOrder a3 = new storeOrder(3003, "someone");
        product ppp1 = new product(9990, "iPhone", "Apple", 500);
        product ppp2 = new product(7777, "camera", "Silicon", 100);
        a3.addItem(ppp1);
        a3.addItem(ppp2);

        a3.finalizeOrder();
        a3.makePayment();
        a3.shipOrder();
        a3.deliverOrder();
        System.out.print("Notify " + a3.get_name() + " : ");
        a3.checkStatus();
    }
}

/*
A correctly implemented program should display:

Order iniated!
Current cost is 1806.0
Current cost is 1100.0
Notify someone@yahoo.com : Order delivered!
Notify 574-321-8765 : Order delivered!
Notify someone : Order delivered!
*/