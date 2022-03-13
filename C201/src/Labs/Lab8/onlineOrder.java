package Lab8;
public class onlineOrder extends order
{
    private String customer_email;
    
    public onlineOrder(int orderNumber, String email)
    {
        // your code goes here
        // 1. call base class constructor
        super(orderNumber);

        // 2. assign email to customer_email
        customer_email = email;

    }
    
    public String get_email()
    {
        // return customer_email
        return customer_email;

    }
}
