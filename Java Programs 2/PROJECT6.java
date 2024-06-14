import java.util.*;
public class PROJECT6 
{

	public static void main(String[] args) 
	{
	     Scanner i= new Scanner(System.in);
	     
	     double a;
	     a= i.nextDouble();
	     double b;
	     b= i.nextDouble();
	     double c;
	     c= i.nextDouble();
	     double d;
	     d= i.nextDouble();
	     double e;
	     e= i.nextDouble();
	     double f;
	     f= i.nextDouble();
	     
	     System.out.println("a, b, c, d, e, f: " + a + " " + b + " " + c + " " + d + " " + e + " " + f);
	     
	     double r= (a*d) - (b*c);
	     
	     double x= ((e*d) - (b*f)) / r;
	     
	     double y= ((a*f) - (e*c)) / r;
	     
	     if (r < 0 || r > 0 )
	        System.out.println("x is " + x + " " + "and y is " + y);
	     else if (r == 0 )
	    	System.out.println("The equation has no solution");
	    
	     i.close();

	}

}
