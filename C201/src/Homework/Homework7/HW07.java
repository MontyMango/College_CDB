package Homework7;
public class HW07
{
    public static void main(String[] args)
    {
        orderList SL = new orderList();
        	
	    for (int i=1; i<10; i++)
	    {
            int rand = (int)(Math.random()*200);
            order s = new order(1001+i, "Product " + i, 500+rand);
            SL.insert_to_head(s);
	    }
	    SL.show_orders();
        
        SL.search_item(1003);
        SL.show_total_cost();
        SL.most_expensive_item();    
    }
}

/*
A correctly implemented program should display some random values, such as:

The node's values are:
1010	Product 9	536.0
1009	Product 8	511.0
1008	Product 7	547.0
1007	Product 6	680.0
1006	Product 5	587.0
1005	Product 4	545.0
1004	Product 3	501.0
1003	Product 2	570.0
1002	Product 1	575.0
1003: 	570.0
Total cost: 	5052.0
Most expensive item cost: 	680.0
*/
