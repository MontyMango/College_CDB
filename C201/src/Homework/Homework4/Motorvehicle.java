package Homework4;

public class Motorvehicle
{
    private String name;
    private int maxspeed;
    private String manufacturer;
    
    public Motorvehicle(String name, int speed, String manuf)
    {
        this.name = name;
        this.maxspeed = speed;
        this.manufacturer = manuf;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getSpeed()
    {
        return this.maxspeed;
    }
}
