package Lab12;
class student
{
    int ID;
    String fName;
    String lName;
    double GPA;
    student next;
    
    student(int ID, String fName, String lName, double GPA)
    {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
        this.next = null;
    }
}
