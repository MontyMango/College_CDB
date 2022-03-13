package Homework.Lab5;

public class product
{
    private int productID;
    private String name;
    private String manufacture;
    private double price;
    
    public product(int id, String name, String mf, double price)
    {
        this.productID = id;
        this.name = name;
        this.manufacture =mf;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
}