package Homework4;

public class Car extends Motorvehicle
{
    private int num_doors;
    
    public Car(String name, int speed, String manuf, int doors)
    {
        // your code goes here
        // complete the constructor
        // (1) call base class constructor
        super(name, speed, manuf);

        // (2) assign doors to num_doors
        this.num_doors = doors;
    }
    
    public int getDoors()
    {
        // your code goes here
        // return num_doors
        return this.num_doors;
    }
}
