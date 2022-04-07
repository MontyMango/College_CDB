package Lab13;
public class studentList
{
    private student head;
    
    public studentList()
    {
       head = null;         
    }
    
    public void insert_to_head(student s)
    {
	if(head==null) head = s;
        else
        {
            s.next = head;
            head = s;
        }
    }
    
    public void show_records()
    {
	System.out.println("The node's values are:");
        student current = head;
	while (current!=null)
	{
            System.out.println(current.ID + "\t" + current.fName + "\t" + current.GPA);
            current = current.next;
	}
    }
    
    public void show_GPA(int student_ID)
    {
        student current = head;
	while (current!=null)
	{
            if(current.ID==student_ID)
            {
                System.out.println(current.ID + ":\t" + current.GPA);
                return;
            }
            else current = current.next;
	}
        
        System.out.println(student_ID + ": not found.");
    }
    
    public void update_GPA(int student_ID, double newGPA)
    {
        student current = head;
	while (current!=null)
	{
            if(current.ID==student_ID)
            {
                current.GPA = newGPA;
                System.out.println(current.ID + ": GPA updated");
                return;
            }
            else current = current.next;
	}
        
        System.out.println(student_ID + ": not found.");
    }
    
    // remove records that have GPA greater than 
    // parameter gpa
    void remove_node(double gpa)
    {
	// Your code goes here
        // remove records that have GPA greater than 
        // parameter gpa
    }
}
