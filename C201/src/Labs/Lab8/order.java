package Lab8;
import java.util.ArrayList;

enum orderStatus
{
    INITIATED, PLACED, PAID, SHIPPED, DELIVERED;
}

public class order
{
    private int orderNumber;
    private ArrayList shoppingCart;
    private double cost;
    orderStatus status;
    
    public order(int orderNumber)
    {
        this.orderNumber = orderNumber;
        shoppingCart = new ArrayList<product>();
        cost = 0;
        status = orderStatus.INITIATED;
    }
    
    public void addItem(product p)
    {
        shoppingCart.add(p);
        cost = cost + p.getPrice();
    }
    
    public void removeItem(product p)
    {
        shoppingCart.remove(p);
        cost = cost - p.getPrice();
    }
    
    public void finalizeOrder()
    {
        status = orderStatus.PLACED;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void makePayment()
    {
        status = orderStatus.PAID;
    }
    
    public void shipOrder()
    {
        status = orderStatus.SHIPPED;
    }
    
    public void deliverOrder()
    {
        status = orderStatus.DELIVERED;
    }
    
    public void checkStatus()
    {
        if(status==orderStatus.INITIATED) System.out.println("Order initiated!");
        else if(status==orderStatus.PLACED) System.out.println("Order placed!");
        else if(status==orderStatus.PAID) System.out.println("Order paid!");
        else if(status==orderStatus.SHIPPED) System.out.println("Order shipped!");
        else System.out.println("Order delivered!");
    }
}