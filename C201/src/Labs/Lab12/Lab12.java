package Lab12;
public class Lab12
{
    public static void main(String[] args)
    {
        studentList SL = new studentList();
        	
	for (int i=0; i<5; i++)
	{
            int rand1 = (int)(Math.random()*100);
            double rand = rand1*1.0/100;
            student s = new student(1001+i, "FN", "LN", 3.0+rand);
            SL.insert_to_head(s);
	}
	SL.show_records();
        
        SL.show_GPA(1003);
        SL.update_GPA(1003, 3.85);
        SL.show_GPA(2003);
        SL.update_GPA(2003, 3.85);
	SL.show_records();        
    }
}
/*
A correctly implemented program should display random values, such as:

The node's values are:
1005	FN	3.09
1004	FN	3.81
1003	FN	3.52
1002	FN	3.35
1001	FN	3.38
1003:	3.52
1003: GPA updated
2003: not found.
2003: not found.
The node's values are:
1005	FN	3.09
1004	FN	3.81
1003	FN	3.85
1002	FN	3.35
1001	FN	3.38

*/
