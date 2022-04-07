package Homework7;
class order
{
    int ItemID;
    String ProductName;
    double cost;
    order next;
    
    order(int ID, String pName, double cost)
    {
        this.ItemID = ID;
        this.ProductName = pName;
        this.cost = cost;
        this.next = null;
    }
}
