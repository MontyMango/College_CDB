package Homework5;

public class Voter
{
    private String firstName;
    private String lastName;
    private int age;
    
    public Voter(String f, String l, int a)
    {
        firstName = f;
        lastName = l;
        age = a;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getFirstname()
    {
        return firstName;
    }
}
