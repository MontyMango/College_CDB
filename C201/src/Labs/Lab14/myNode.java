package Lab14;
// generic class: list node
class myNode<E>
{
    int nodeID;
    // your code goes here
    // declare a generic data type member called data
    
    myNode next;
    
    myNode(int ID, E data)
    {
        this.nodeID = ID;
        this.data = data;
        this.next = null;
    }
}
