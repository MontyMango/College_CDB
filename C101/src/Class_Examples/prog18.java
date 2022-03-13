/*      PROG18.JAVA 

Action: Program demonstrates how function overloading works.
It is possible to have multiple functions with the same name
providing the parameter lists are different in way of data types 
or number of parameters.                                */
package Class_Examples;
public class prog18 
{
  public static void main(String[] args) 
  {
    int N = 3;
    float X = 2.5f;
    
    System.out.println(N + " cubed is " + Cube(N));
    System.out.println(X + " cubed is " + Cube(X));
    Cube();
  }
  
  /* *****************************************************
  Action: Function accepts integer and returns the cube
  Parameter: integer
  returns: integer raised to third power  
  --------------------------------------------------------*/
  static int Cube(int M)
  {
    return M*M*M;
  }
    
  /* *****************************************************
  Action: Function accepts float and returns the cube
  Parameter: float
  returns: float raised to third power  
  --------------------------------------------------------*/
  static float Cube(float M)
  {
    return M*M*M;
  }
  
  /* *****************************************************
  Action: Function displays cube of a double
  Parameter: none
  returns: nothing  
  --------------------------------------------------------*/
  static void Cube()
  {
    double Y = 2.5;
    
    System.out.println(Y + " cubed is " + (Y*Y*Y));      
  }    
}
/* ***********  output  ******************************
3 cubed is 27
2.5 cubed is 15.625
2.5 cubed is 15.625                       */
