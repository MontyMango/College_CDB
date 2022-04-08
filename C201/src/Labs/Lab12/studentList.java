package Lab12;
public class studentList
{
    private student head;
    
    public studentList()
    {
       head = null;         
    }
    
    public void insert_to_head(student s)
    {
	    // your code goes here
        student current = head;

        if (current != null) {
            s.next = current;
        }
        // insert s to the front of the list
        head = s;
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
        // your code goes here
        student current = head;
        while (current!=null)
        {
            // show GPA of student ID (student_ID)
            if(current.ID == student_ID)    {
                System.out.println(student_ID + ":\t" + current.GPA);
                return;
            }
            current = current.next;
        }
        // if no such student ID, display a message "Not Found"
        System.out.println(student_ID + ": not found.");
    }
    
    public void update_GPA(int student_ID, double newGPA)
    {
        // your code goes here
        student current = head;

        // update GPA of student ID (student_ID) with newGPA
        while (current!=null)
        {
            if(current.ID == student_ID)    {
                current.GPA = newGPA;
                System.out.println(student_ID + ": GPA updated");
                return;
        }
            current = current.next;
        }
        // if no such student ID, display a message "Not Found"
        System.out.println(student_ID + ": not found.");
    }
}
