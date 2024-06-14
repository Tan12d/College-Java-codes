import java.util.*;
public class PROJECT5 
{

	public static void main(String[] args) 
	{
		Scanner t= new Scanner(System.in);
		
		double a;
		a= t.nextDouble();
		double b;
		b= t.nextDouble();
		double c;
		c= t.nextDouble();
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
        System.out.println("c= " + c);
        
        double x= Math.pow(b,2);
        double D= x - 4*a*c;
        
        double u= Math.pow(D,0.5);
        
        double r1= (-b + u) / (2*a);
        double r2= (-b - u) / (2*a);
        
        if ( D > 0 )
        	System.out.println("The equation has two roots " + r1 + " " + "and" + " " + r2);
        else if ( D == 0 )
        	System.out.println("The equation has one root " + r1);
        else if ( D < 0 )
            System.out .println("The equation has no real roots");
        
        t.close();
        
	}

}
