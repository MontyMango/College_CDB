package Homework7;
public class orderList
{
    private order head;
    
    public orderList()
    {
       head = null;         
    }
    
    public void insert_to_head(order o)
    {
	    // your code goes here
        order current = head;

        // insert o to the front of the list
        if (current != null) {
            o.next = head;
        }
        head = o;
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
        // your code goes here
        order current = head;

        while (current != null)
        {
            // show cost of Item==ItemI
            if(current.ItemID == ItemID)    {
                System.out.println(ItemID + ":\t" + current.cost);
                return;
            }
            current = current.next;
        }

        // if no such item, display a message "Not Found"
        System.out.println("Not Found");
    }
        
    public void show_total_cost()
    {
        // your code goes here
        double total = 0;

        order current = head;
        while (current != null) {
            total += current.cost;
            current = current.next;
        }

        // show the total cost of all orders      
        System.out.println("Total cost:\t\t" + total);
    }
    
    public void most_expensive_item()
    {
        // your code goes here
        double Largest = 0;
        order current = head;

        // show cost of the most expensive item
        while(current != null)  {
            if (current.cost > Largest)  {
                Largest = current.cost;
            }
            current = current.next;
        }

        // if list is empty, show nothing
        if (Largest != 0)   {
            System.out.println("Most expensive item cost:\t" + Largest);
        }
    }
}
