import java.util.*;

public class PRO4 
{

	public static void main(String[] args) 
	{
		Scanner u= new Scanner(System.in);

		int integer_number;
		integer_number= u.nextInt();
		
		System.out.println("Enter a number between 0 and 1000: " + integer_number);
		
		int am= integer_number % 10;
		int um= integer_number / 10;
		int zm= um%10;
		int ym=um/10;
		
		int result= am + zm + ym;
		
		System.out.println("The sum of the digits is " + result);
        
		u.close();
		
	}

}
