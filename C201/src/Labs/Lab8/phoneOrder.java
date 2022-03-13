package Lab8;
public class phoneOrder extends order
{
    private String customer_phone;
    
    public phoneOrder(int orderNumber, String phone)
    {
        // your code goes here
        // 1. call base class constructor
        super(orderNumber);

        // 2. assign phone to customer_phone
        customer_phone = phone;

    }
    
    public String get_phone()
    {
        // return customer_phone
        return customer_phone;
    }
}
