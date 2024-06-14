import java.util.*;

public class PR012 
{

	public static void main(String[] args) 
	{
		Scanner k= new Scanner(System.in);
		
		long number_of_minutes;
		
		number_of_minutes= k.nextLong();
		
		System.out.println("Enter the number of minutes: " + number_of_minutes);
		
		// 1 hour = 60 minutes
	    long number_of_hours= number_of_minutes / 60;
		
		// 1 day = 24 hours
		long Number_of_Days= number_of_hours / 24;
		
		// 1 year = 365 days
		long number_of_years= Number_of_Days / 365;
		
		long number_of_days= Number_of_Days % 365;
		
		System.out.println(+ number_of_minutes + " minutes is approximately " + number_of_years + " years and " + number_of_days + " days ");
		
		k.close();
		

	}

}
