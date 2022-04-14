package Lab13;
import java.util.Scanner;
public class Lab13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // your code goes here
        // create an instance (object) of studentList
        studentList sL = new studentList();
        	
	for (int i=0; i<5; i++)
	{
            int ID= 1001+i;
            String first_name;
            String last_name;
            double GPA;
            
            // your code goes here
            // ask user to enter first name, last name and GPA
            System.out.print("Enter your first name\nFirst name: ");
            first_name = input.next();

            System.out.print("Enter your last name\nLast name: ");
            last_name = input.next();

            System.out.print("Enter your GPA\nGPA: ");
            GPA = input.nextDouble();

            // for each student and assign user inputs to first_name,
            // last_name, and GPA

            // your code goes here
            // create an instance (object) of student with ID, first_name,
            // last_name, and GPA
            student new_student = new student(ID,first_name,last_name,GPA);
            
            // your code goes here
            // insert the student instance (object) into studentList instance (object)
            sL.insert_to_head(new_student);
	}
        
        // your code goes here
        // 1. call show_records() method of studentList object
        sL.show_records();
        // 2. call remove_node(3.2) method of studentList object to
        //    remove records with gpa greater than 3.2
        sL.remove_node(3.2);
        // 3. call show_records() method of studentList object
       sL.show_records();
    }
}
