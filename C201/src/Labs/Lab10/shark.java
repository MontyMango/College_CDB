package Lab10;
public class shark extends animal implements animalSwim
{
	double weight;  // in lbs
	
    public shark(double w)
    {
        super("chondrichthyes", "fish", "sea", 30);
        weight = w;
    }
    
    public void prey()
    {
    	System.out.println("I eat fish and sea mammals!");
    }
        
    public void swim()
    {
    	System.out.println("I swim with body fins and tail fin!");
    }
}