package Homework4;

public class Bus extends Motorvehicle
{
    private int num_seats;
    
    public Bus(String name, int speed, String manuf, int s)
    {
        // your code goes here
        // complete the constructor
        // (1) call base class constructor
        super(name, speed, manuf);

        // (2) assign s to num_seats
        this.num_seats = s;
    }
       
    public int getSeats()
    {
        return this.num_seats;
    }
}
