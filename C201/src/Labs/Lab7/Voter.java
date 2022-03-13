package Lab7;

enum Party
{
    Democractic, Republican, Independent;
}

public class Voter
{
    private int voterID;
    private String DOB;
    private String SSN;
    private String firstName;
    private String lastName;
    private Party p;
    private String address;
    
    public Voter(int id, String DOB, String ssn, String fn, String ln, Party p, String address)
    {
        this.voterID = id;
        this.DOB = DOB;
        this.SSN = SSN;
        this.firstName = fn;
        this.lastName = ln;
        this.p = p;
        this.address = address;
    }
    
    int getID()
    {
        return voterID;
    }
    
    String getName()
    {
        return firstName + " " + lastName;
    }
    
    String getDOB()
    {
        return DOB;
    }
    
    String getAddress()
    {
        return address;
    }
}