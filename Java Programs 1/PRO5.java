import java.util.*;

public class PRO5 
{

	public static void main(String[] args) 
	{
		Scanner i= new Scanner(System.in);
		
		float v0;
		float v1;
		float t;
		
		v0= i.nextFloat();
		v1= i.nextFloat();
		t= i.nextFloat();
		
		System.out.println("Enter v0, v1, and t: " + v0 + " " + v1 + " " + t);
        
		float a= (v1 - v0)/t;
		
		System.out.println("The average acceleration is " + a);
		
		i.close();
		
	}

}
