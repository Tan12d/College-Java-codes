import java.util.*;

public class PRO10 
{

	public static void main(String[] args) 
	{
		Scanner ui= new Scanner(System.in);
		
		float x1;
	    float y1;
		
		float x2;
		float y2;
		
		float x3;
		float y3;
		
		x1= ui.nextFloat();
		y1= ui.nextFloat();
		
		x2= ui.nextFloat();
		y2= ui.nextFloat();
		
		x3= ui.nextFloat();
		y3= ui.nextFloat();
		
		System.out.println("Enter three points for a triangle: " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
		
		float a= (x2 - x1);
		float b= (y2 - y1);
		
		double c= Math.pow(a,2);
		double d= Math.pow(b,2);
		
		double res1= (c + d);
		
		double side1= Math.pow(res1,0.5);
		
		float e= (x3 - x2);
		float f= (y3 - y2);
		
		double g= Math.pow(e,2);
		double h= Math.pow(f,2);
		
		double res2= (g + h);
		
		double side2= Math.pow(res2,0.5);
		
		float i= (x3 - x1);
		float j= (y3 - y1);
		
		double k= Math.pow(i,2);
		double l= Math.pow(j,2);
		
		double res3= (k + l);
		
		double side3= Math.pow(res3,0.5);
		
		double s= (side1 + side2 + side3)/2;
		
		double m= (s * (s - side1) * (s - side2) * (s - side3));
		
		double area= Math.pow(m,0.5);
		
		System.out.println("The area of the triangle is " + area);
	
	}

}
