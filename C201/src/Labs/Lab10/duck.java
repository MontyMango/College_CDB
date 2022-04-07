/* your code goes here
 * define a public class duck inherited from animal and
 * implements the three interfaces in this program
 * 1. duck class has a private data member: color (String)
 * 2. duck class has a constructor that takes a string argument
 * 		2a. It calls parent class constructor with parameters ("anatidae", "bird", "pond", 5)
 * 		2b. It assign the string parameter to color data member
 * 3. duck class implements four public methods prey(), run(), fly(), swim()
 *    with The following messages that will be displayed respectively:
 * 		"I eat insects, worms, and more!"
 * 		"I run with two legs!"
 * 		"I fly with two wings!"
 * 		"I swim with my webbed feet!"
 */
package Lab10;
public class duck extends animal implements animalRun, animalSwim, animalFly  {
    private String color;

    public duck(String input_color) {
        super("anatidae","bird","pond",5);
        this.color = input_color;
    }

    @Override
    public void prey()  { System.out.println("I eat insects, worms, and more!"); }

    @Override
    public void run()   { System.out.println("I run with two legs!"); }

    @Override
    public void fly()   { System.out.println("I fly with two wings!"); }

    @Override
    public void swim()  { System.out.println("I swim with my webbed feet!"); }
}