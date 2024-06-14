import java.util.*;

public class PRO3 
{

	public static void main(String[] args) 
	{
		Scanner p= new Scanner(System.in);
		
		double number;
		number= p.nextDouble();
		
		System.out.println("Enter a value for feet: " + number);
		
		double result= number * 0.305;
		
		System.out.println(+ number + " feet is " + result + " meters ");
		
		

	}

}
