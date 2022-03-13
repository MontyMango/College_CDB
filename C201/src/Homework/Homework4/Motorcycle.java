package Homework4;

enum MC_Engine {twoStroke, fourStroke};
enum MC_Type {standard, sport, toiring, cruise, adventure};

public class Motorcycle extends Motorvehicle
{
    private MC_Engine e;
    private MC_Type t;
    
    public Motorcycle(String name, String manuf, int speed, MC_Engine e, MC_Type t)
    {
        // your code goes here
        // complete the constructor
        super(name,speed,manuf);

        this.e = e;
        this.t = t;
    }
    
    public MC_Type getType()
    {
        return t;
    }
}
