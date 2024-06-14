import java.util.*;
public class PROJECT3 
{

	public static void main(String[] args) 
	{
		Scanner o= new Scanner(System.in);
		
		int number;
		number= o.nextInt();
		
		System.out.println("Enter the number: " + number);
		
		int a= number%2;
		
		if( a == 0 )
			System.out.println("The number is even.");
		else
			System.out.println("The number is odd.");
		
		o.close();
        
	}

}
