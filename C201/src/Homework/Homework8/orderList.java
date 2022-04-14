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
        if (this.head == null)    {
            this.head = n;
            return;
        }

        else if (this.head.cost > n.cost) {
            n.next = this.head;
            this.head = n;
            return;
        }

        // insert o into list so that the cost of orders are
        // in increasing order.
        order current = this.head;
        while (current.next != null)    {
            if (n.cost < current.next.cost)  {
                n.next = current.next;
                current.next = n;
                return;
            }
            current = current.next;
        }
        current.next = n;
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
        order current = this.head;
        int length = 0;
        double avg = 0, total = 0;

        // if no orders in list, show message "Empty List"
        if (current == null) System.out.println("Empty List");

        else {
            while (current != null) {
                total += current.cost;
                length++;
                current = current.next;
            }
            // display the average cost of all orders
            avg = total / length;
            System.out.println("Average cost:\t" + avg);
        }
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
