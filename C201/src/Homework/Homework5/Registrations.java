package Homework5;
import java.util.ArrayList;

public class Registrations
{
    private String location;
    private int year;
    
    private ArrayList al;
    
    public Registrations(String l, int y)
    {
        location = l;
        year = y;
        al = new ArrayList<Voter>();
    }
    
    public void register(Voter v) throws InvalidAgeException
    {
        // your code goes here:
        // if Voter v's age is less than 18, throw InvalidAgeException with message "not valid"
        if(v.getAge() < 18) {
            throw new InvalidAgeException("not valid");
        }

        // else add v to ArrayList al and display a message Voter v's first name: welcome to vote.
        else {
            System.out.println(v.getFirstname() + " welcome to vote.");
            this.al.add(v);
        }
    }
}
