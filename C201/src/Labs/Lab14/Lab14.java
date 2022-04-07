package Lab14;
public class Lab14
{
    public static void main(String[] args)
    {
        myList SL = new myList();
        
        myNode nd1 = new myNode(1001, Math.PI);
        myNode nd2 = new myNode(2002, "Hello World");
        
        Integer IT = new Integer(999);
        myNode nd3 = new myNode(3003, IT);
        
        student ST = new student(9099191, "Janet", "Francis", 3.85);
        myNode nd4 = new myNode(4004, ST);
	
        SL.insert_to_head(nd1); 
        SL.insert_to_head(nd2);   
        SL.insert_to_head(nd3); 
        SL.insert_to_head(nd4);
        
        SL.show_nodes();
        System.out.println(SL.search_item(3003));
    }
}

/*
A correctly implemented program should display:

The node's values are:
4004	: GPA of ID 9099191 = 3.85
3003	: 999
2002	: Hello World
1001	: 3.141592653589793
999

*/
