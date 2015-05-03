public class Zustand
{
  public static void main(String[] args)
  {
    final int DIV = 2;
    int number;
    int counter;
    {
    	// DIV = 2
    	number = 10;  
        int y = 12;    	
    	number += y;
    	// DIV = 2, number = 22, y = 12
    }
    final double d;
    {  
        counter = 1;
        double a = 2.0;
        //  d = undifined, counter = 1, a = 2.0
        {
    	    d = a + counter++;
            //  d = 3.0, counter = 2, a = 2.0
        }
    } 
    number = number / DIV;
    //  number = 11, d = 3.0, counter = 2, DIV = 2
  } 
}