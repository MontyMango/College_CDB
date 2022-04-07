package Lab10;
//abstract class
public abstract class animal
{
    String academicName;
    String type;
    String habitat;
    int life_expectancy;
    
    public animal(String name, String type, String habitat, int life_expectancy)
    {
        this.academicName = name;
        this.type = type;
        this.habitat = habitat;
        this.life_expectancy = life_expectancy;
    }
    
    public String getName()
    {
        return academicName;
    }
    
    // your code goes here
    // declare an abstract method prey()
    public abstract void prey();
}
