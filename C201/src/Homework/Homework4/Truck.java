package Homework4;

public class Truck extends Motorvehicle
{
    private int num_wheels;
    private double power;
    
    public Truck(String name, int speed, String manuf, int wheels, double power)
    {
        // your code goes here
        // complete the constructor
        // (1) call base class constructor
        super(name, speed, manuf);

        // (2) assign wheels to number_wheels
        this.num_wheels = wheels;

        // (3) assign power to power
        this.power = power;
    }
    
    public double getPower()
    {
        return power;
    }
    
    public int getWheels()
    {
        return this.num_wheels;
    }
}
