import java.util.*;
public class PROJECT7 
{

	public static void main(String[] args) 
	{
		Scanner e= new Scanner(System.in);
		
		float a;
		float b;
		
		a= e.nextFloat();
		b= e.nextFloat();
		
		if ( a > 0 && b > 0 )
			System.out.println("(" + a + "," + b + ") is in quadrant I");
		else if ( a < 0 && b > 0 )
			System.out.println("(" + a + "," + b + ") is in quadrant II");
		else if ( a < 0 && b < 0 )
			System.out.println("(" + a + "," + b + ") is in quadrant III");
		else if ( a > 0 && b < 0 )
			System.out.println("(" + a + "," + b + ") is in quadrant IV");
		
		float l= e.nextFloat();
		float m= e.nextFloat();
		
		if ( l == 0 && m > 0 )
			System.out.println("(" + l + "," + m + ") is on the positive y-axis");
		else if ( l == 0 && m < 0 )
			System.out.println("(" + l + "," + m + ") is on the negative y-axis");
		else if ( l > 0 && m == 0 )
			System.out.println("(" + l + "," + m + ") is on the positive x-axis");
		else if ( l < 0 && m == 0 )
			System.out.println("(" + l + "," + m + ") is on the negative x-axis");
		
		e.close();
		
	}
	
}