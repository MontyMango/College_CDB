package Homework8;
public class orderList
{
    private order head;
    
    public orderList()
    {
       head = null;         
    }
    
    public void insert_to_head(order o)
    {
        o.next = head;
        head = o;

    }
    
    // insert in increasing order of cost
    public void insert_in_order(order n)
    {
        // your code goes here
        // insert o into list so that the cost of orders are
        // in increasing order.
        
    }
    
    public void show_orders()
    {
	System.out.println("The node's values are:");
        order current = head;
	while (current!=null)
	{
            System.out.println(current.ItemID + "\t" + current.ProductName + "\t" + current.cost);
            current = current.next;
	}
    }
    
    public void search_item(int ItemID)
    {
        order current = head;
	while (current!=null)
	{
            if(current.ItemID==ItemID)
            {
                System.out.println(current.ItemID + ": \t" + current.cost);
                return;
            }
            current = current.next;
	}
        
        System.out.println(ItemID + ": not found");
    }
        
    public void show_total_cost()
    {
        order current = head;
        double total = 0;
	while (current!=null)
	{
            total = total + current.cost;
            current = current.next;
	}

        System.out.println("Total cost: \t" + total);
    }
    
    public void show_average_cost()
    {
        // your code goes here
        // display the average cost of all orders
        // if no orders in list, show message "Empty List"
    }
    
    public void most_expensive_item()
    {
        order current = head;
        double cost = -999;
	while (current!=null)
	{
            if(current.cost>cost) cost = current.cost;
            current = current.next;
	}
        
        if(cost > -999) System.out.println("Most expensive item cost: \t" + cost);
    }
}
