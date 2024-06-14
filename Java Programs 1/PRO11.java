import java.util.*;

public class PRO11 
{

	public static void main(String[] args) 
	{
		Scanner o= new Scanner(System.in);
		
		int number_of_eggs;
		
		number_of_eggs= o.nextInt();
		
		int y=144;
		System.out.println("1 gross = " + y + " eggs ");
		
        int number_of_gross= number_of_eggs / 144;
        
        int a= number_of_eggs % 144;
        
        int number_of_dozens= a / 12;
        
        int numer_of_leftovereggs= a % 12;
        
        System.out.println("Your number of eggs is " + number_of_gross + " gross, " + number_of_dozens + " dozen, and " + numer_of_leftovereggs + ".");
	}

}
