import java.util.*;

public class PRO9 
{

	public static void main(String[] args) 
	{
		Scanner w= new Scanner(System.in);
		
		double x1;
		double y1;
		
		x1= w.nextDouble();
		y1= w.nextDouble();
		
		double x2;
		double y2;
		
		x2= w.nextDouble();
		y2= w.nextDouble();
		
		System.out.println("Enter x1 and y1: " + x1 + " " + y1);
		System.out.println("Enter x2 and y2: " + x2 + " " + y2);
		
		double a= (x2 - x1);
		double b= (y2 - y1);
		
		double c= Math.pow(a,2);
		double d= Math.pow(b,2);
		
		double e= (c + d);
		 
		double f= Math.pow(e,0.5);
		
		System.out.println("The distance between the two points is " + f);
		
		w.close();
	}

}
