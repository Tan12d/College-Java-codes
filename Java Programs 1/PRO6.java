import java.util.*;

public class PRO6 
{

	public static void main(String[] args) 
	{
		Scanner b= new Scanner(System.in);
		
		double weight_in_pounds;
		double height_in_inches;
		
		weight_in_pounds= b.nextDouble();
		height_in_inches= b.nextDouble();
		
		System.out.println("Enter weight in pounds: " + weight_in_pounds);
		System.out.println("Enter height in inches: " + height_in_inches);
		
		double weight_in_kilograms= weight_in_pounds * 0.45359237;
		double height_in_meters= height_in_inches * 0.0254;
		
		double x= (weight_in_kilograms)/( height_in_meters * height_in_meters);
        
		System.out.println("BMI is " + x);
		
	}

}
