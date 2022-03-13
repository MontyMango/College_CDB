package Lab8;

public class storeOrder extends order
{
    private String customer_name;
    
    public storeOrder(int orderNumber, String name)
    {
        // your code goes here
        // 1. call base class constructor
        super(orderNumber);

        // 2. assign name to customer_name
        customer_name = name;

    }
    
    public String get_name()
    {
        // return customer_name
        return customer_name;

    }
}
