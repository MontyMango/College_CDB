package Homework4;

public class GasCar extends Car
{
    private double mpg;
    
    public GasCar(String name, int speed, String manuf, int doors, double mpg)
    {
        // your code goes here
        // complete the constructor
        // (1) call base class constructor
        super(name,speed,manuf,doors);

        // (2) assign mpg to mpg
        this.mpg = mpg;
    }
    
    public double getMPG()
    {
        // your code goes here
        // return mpg
        return this.mpg;
    }
}
