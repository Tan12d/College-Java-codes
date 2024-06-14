import java.util.*;
public class PROJECT12
{

	public static void main(String[] args) 
	{
		Scanner t= new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		x= t.nextInt();
		y= t.nextInt();
		z= t.nextInt();
		
		System.out.println("Enter three integers: " + x + " " + y + " " + z);
		
		int res1= Math.min(x,y);
		int res2= Math.min(y,z);
		int res3= Math.min(res1,res2);
		
		int res4= Math.max(x,y);
		int res5= Math.max(y,z);
		int res6= Math.max(res4,res5);
		
		if( x < y && y < z && x < z)
		{
			int res7= Math.min(x,y);
			int res8= Math.min(y,z);
			int res9= Math.max(res7,res8);
			
			System.out.println("Display the integers in non-decreasing order: " + res3 + " < " + res9 + " < " + res6);
			
		}
		else if( x > y && y > z && x > z) 
		{
			int res10= Math.min(x,y);
			int res21= Math.min(y,z);
			int res11= Math.max(res10,res21);

			System.out.println("Display the integers in non-decreasing order: " + res3 + " < " + res11 + " < " + res6);
			
		}
		
		else if( x < y && y > z && x < z)
		{
			int res10= Math.min(x,z);
			int res20= Math.min(y,z);
			int res11= Math.max(res10,res20);

			System.out.println("Display the integers in non-decreasing order: " + res3 + " < " + res11 + " < " + res6);
			
		}
		else if (x < y && y > z && x > z)
		{
			int res10= Math.min(x,z);
			int res11= Math.max(res10,y);

			System.out.println("Display the integers in non-decreasing order: " + res3 + " < " + res11 + " < " + res6);
	
		}
		else if (x > y && y < z && x > z )
		{ 
			int res24= Math.min(x,y);
			int res25= Math.max(res24,z);
			
			System.out.println("Display the integers in non-decreasing order: = " + res3 + " < " + res25 + " < " + res6);
		}
		else if (x > y && y < z && x < z )
		{ 
			int res26= Math.max(x,y);
			int res27= Math.min(res26,z);
			
			System.out.println("Display the integers in non-decreasing order: " + res3 + " < " + res27 + " < " + res6);
		}
	}

}
