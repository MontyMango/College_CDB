package Homework8;
public class HW08
{
    public static void main(String[] args)
    {
        orderList SL = new orderList();
        	
	for (int i=1; i<10; i++)
	{
            int rand = (int)(Math.random()*200);
            order s = new order(1001+i, "Product " + i, 500+rand);
            SL.insert_in_order(s);
	}
	SL.show_orders(); 
        
        SL.search_item(1003);
        SL.show_total_cost();
        SL.most_expensive_item();  
        SL.show_average_cost();
    }
}

/*
A correctly implemented program should display some random values, such as:

The node's values are:
1002	Product 1	518.0
1010	Product 9	528.0
1009	Product 8	528.0
1008	Product 7	556.0
1006	Product 5	572.0
1005	Product 4	578.0
1007	Product 6	600.0
1004	Product 3	616.0
1003	Product 2	637.0
1003: 	637.0
Total cost: 	5133.0
Most expensive item cost: 	637.0
Average cost: 	570.3333333333334
*/
