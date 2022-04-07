package Lab14;
//generic class: list
public class myList<E>
{
    private myNode head;
    
    public myList()
    {
       head = null;         
    }
    
    public void insert_to_head(myNode o)
    {
	if(head==null) head = o;
        else
        {
            o.next = head;
            head = o;
        }
    }
    
    public void show_nodes()
    {
	System.out.println("The node's values are:");
        myNode current = head;
	while (current!=null)
	{
            System.out.println(current.nodeID + "\t: " + current.data.toString());
            current = current.next;
	}
    }
    
    // your code goes here
    // create a method search_item(int ItemID)
    // that can search the list based on (nodeID==ItemID)
    // and return the data field of the node.
    // If no such node found, return null
    
}
