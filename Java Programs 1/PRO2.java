import java.util.*;

public class PRO2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		float radius;
		int length;
		
		radius= sc.nextFloat();
		length= sc.nextInt();
		
		System.out.println("Enter the radius and length of a cylinder: " + radius + " " + length);
		
		double area= radius * radius * 3.14159;
		
		System.out.println("The area is " + area);
		
		double volume= area * length;
		
		System.out.println("The volume is " + volume);
		

	}

}
