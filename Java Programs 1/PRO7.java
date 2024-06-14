import java.util.*;

public class PRO7 
{

	public static void main(String[] args) 
	{
		Scanner e= new Scanner(System.in);
		
		float s;
		s= e.nextFloat();
		
		System.out.println("Enter the side: " + s);
        
		double a= 3 * Math.sqrt(3);
		double b= a / 2;
		
	    double Area= b * (s * s);
		
		System.out.println("The area of the hexagon is " + Area);
		
		e.close();
		
	}

}
