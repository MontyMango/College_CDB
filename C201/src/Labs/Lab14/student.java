package Lab14;
class student
{
    int ID;
    String fName;
    String lName;
    double GPA;
    
    student(int ID, String fName, String lName, double GPA)
    {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
    }
    
    //overwrite default toString() method
    public String toString()
    { 
        return String.format("GPA of ID " + ID + " = " + GPA);
    }
}
