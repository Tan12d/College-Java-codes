import java.util.*;
public class PROJECT11 
{

	public static void main(String[] args) 
	{
		Scanner y= new Scanner(System.in);
		
		float weight;
		weight= y.nextFloat();
		
		System.out.println("weight = " + weight);

		if ( weight < 18.5 )
			System.out.println("underweight");
		else if ( weight >= 18.5 && weight <= 24.9 )
			System.out.println("normal weight");
		else if ( weight >= 25.0 && weight <= 29.9 )
			System.out.println("overweight");
		else if ( weight >= 30 )
			System.out.println("obese");
		
		y.close();
	}

}
