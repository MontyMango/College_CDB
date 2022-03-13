package Homework5;
public class hw05
{
    public static void main(String[] args)
    {
        Registrations iusb = new Registrations("South Bend, IN", 2020);
        Voter v1 = new Voter("John", "Smith", 21);
        Voter v2 = new Voter("Lisa", "Phil", 17);
        Voter v3 = new Voter("Dew", "Louise", 37);
        
        // your code goes here
        // through iusb, register v1, v2 and v3
        try {
            iusb.register(v1);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        try {
            iusb.register(v2);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        try {
            iusb.register(v3);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}

/*
A correctly implemented program should display:

John: welcome to vote!
InvalidAgeException: not valid
Dew: welcome to vote!

*/