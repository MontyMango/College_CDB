import java.util.ArrayList;
import java.util.Scanner;

public class
lab01
{
   public static void main(String args[])
   {
        ArrayList <String> studentList = new ArrayList <>();
       
        addStudents(studentList);
        displayStudents(studentList);
        removeStudents(studentList);
        displayStudents(studentList);
        return;
   }
   
   static void addStudents(ArrayList students)
   {
        Scanner input = new Scanner(System.in);
        boolean done = false;
       
        while(done == false)
        {
            System.out.print("Please enter a student name to add (empty input indicates all names are entered): ");
            String new_student = input.nextLine();
            if(new_student.equals(""))
            {
                done = true;
            }
            else
            {
                students.add(new_student);
            }
        }
   }
   
    static void displayStudents(ArrayList students)
    {  
        System.out.println("\nAll students in the list:");
        
        for (Object item : students)    {
            System.out.println(item);
        }
        
        System.out.println();
        return;
   }
    
    static void removeStudents(ArrayList students)
    {
        Scanner input = new Scanner(System.in);
        boolean done = false;
       
        while(done == false)
        {
            System.out.print("Please enter a student name to remove (empty input indicates you are done): ");
            String student = input.nextLine();
            if(student.equals(""))
            {
                done = true;
            }
            else
            {
                students.remove(student);
            }
        }
        
        return;
    }
}