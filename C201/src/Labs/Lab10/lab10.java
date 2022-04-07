package Lab10;
import java.util.Scanner;
public class lab10
{
    public static void main(String[] args)
    {
        animal ScoobyDoo = new dog("Great Dane");
        animal DonaldDuck = new duck("Yellow");
        animal Sharpedo = new shark(196);

        Scanner input = new Scanner(System.in);
        System.out.println("Which animal's predation do you what to know?");
        System.out.println("1. dog; 2. duck; 3: shark");
        System.out.print("Your choice: ");;		
        int choice = input.nextInt();

        animal a;
        if(choice == 1) a = ScoobyDoo;
        else if (choice == 2) a = DonaldDuck;
        else a = Sharpedo;

        howtoPrey(a);
        System.out.println("*********************************************");

        System.out.println("Which animal's swimming do you what to know?");
        System.out.println("1. dog; 2. duck; 3: shark");
        System.out.print("Your choice: ");;		
        choice = input.nextInt();

        animalSwim b; // must use interface
        if(choice == 1) b = (dog)ScoobyDoo;
        else if (choice == 2) b = (duck)DonaldDuck;
        else b = (shark)Sharpedo;

        howtoSwim(b);
    }
	
    public static void howtoPrey(animal a)
    {
        a.prey();
    }

    // must pass an interface
    public static void howtoSwim(animalSwim a)
    {
        a.swim();
    }
}
