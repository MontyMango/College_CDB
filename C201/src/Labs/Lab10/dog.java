package Lab10;
public class dog extends animal implements animalRun, animalSwim
{
	String breed;
	
    public dog(String b)
    {
        super("canine", "mammal", "land", 15);
        breed = b;
    }
    
    public void prey()
    {
    	System.out.println("We hunt raccoons and more!");
    }
    
    public void run()
    {
    	System.out.println("I run with four legs!");
    }
    
    public void swim()
    {
    	System.out.println("I swim with four legs!");
    }
}
