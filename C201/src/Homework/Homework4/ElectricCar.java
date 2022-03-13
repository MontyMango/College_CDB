package Homework4;

public class ElectricCar extends Car
{
    private double milesRecharge;
    
    public ElectricCar(String name, int speed, String manuf, int doors, double mR)
    {
        // your code goes here
        // complete the constructor
        // (1) call base class constructor
        super(name,speed,manuf,doors);

        // (2) assign mR to milesRecharge
        this.milesRecharge = mR;
    }
    
    public double getmilesRecharge()
    {
        // your code goes here
        // return milesRecharge;
        return this.milesRecharge;
    }
}
