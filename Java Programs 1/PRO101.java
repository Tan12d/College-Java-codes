import java.util.*;

public class PRO101 
{

	public static void main(String[] args) 
	{
		Scanner z= new Scanner(System.in);
		
		float investment_amount;
		float annual_interest_rate;
		float number_of_years;

		investment_amount= z.nextFloat();
		annual_interest_rate= z.nextFloat();
		number_of_years= z.nextFloat();
		
		System.out.println("Enter investment amount: " + investment_amount);
		System.out.println("Enter annual interest rate in percentage: " + annual_interest_rate);
		System.out.println("Enter number of years: " + number_of_years);
		
		double a= annual_interest_rate / 100;
		double monthlyInterestRate= a / 12;
				
		double b= number_of_years * 12;
		
		double c= (1 + monthlyInterestRate);
		
		double d= Math.pow(c,b);
		
		double futureInvestmentValue= investment_amount * d;
		
		System.out.println("Accumulated value is $" + futureInvestmentValue);
		
		z.close();
		
	}

}
