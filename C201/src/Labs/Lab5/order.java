package Homework.Lab5;

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
        //your code goes here
        this.shoppingCart.add(p.getName());     //(1)add Homework.Lab5.product p to shoppingcart
        this.cost += p.getPrice();              //(2)update cost
    }
    
    public void removeItem(product p)
    {
        //your code goes here
        this.shoppingCart.remove(p.getName());  //(1)remove Homework.Lab5.product p from shoppingcart
        this.cost -= p.getPrice();              //(2)update cost
    }
    
    public void finalizeOrder()
    {
        status = orderStatus.PLACED;
    }
    
    public double getCost()
    {
        return this.cost;   //return cost
    }
    
    public void makePayment()
    {
        this.status = orderStatus.PAID; //update status
    }
    
    public void shipOrder()
    {
        this.status = orderStatus.SHIPPED;  //update status
    }
    
    public void deliverOrder()
    {
        this.status = orderStatus.DELIVERED; //update status
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