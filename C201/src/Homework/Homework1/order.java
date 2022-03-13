package Homework1;
public class order
{
    private int orderNumber;
    private String product_name;
    private int quantity;
    private double cost;
    int status;
    /*
    status:
    1: Homework.Lab5.order placed
    2: payment made
    3: Homework.Lab5.order shipped
    4. Homework.Lab5.order delivered
    */
    
    public order(int orderNumber, String pn, int q, double cost)
    {
        // your code goes here
        this.orderNumber = orderNumber; // assign orderNumber to orderNumber
        this.product_name = pn; // assign pn to product_name
        this.quantity = q;// assign q to quantity
        this.cost = cost; // assign cost to cost
        this.status = 1; // assign 1 to status
    }
    
    public void makePayment()
    {
        // your code goes here
        this.status = 2; // update status
    }
    
    void shipOrder()
    {
        // your code goes here
        this.status = 3;// update status
    }
    
    void deliverOrder()
    {
        // your code goes here
        this.status = 4; // update status
    }
    
    void checkStatus()
    {
        if(status==1) System.out.println("Order placed!");
        else if(status==2) System.out.println("Order paid!");
        else if(status==3) System.out.println("Order shipped!");
        else System.out.println("Order delivered!");
    }
}