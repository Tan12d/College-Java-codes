import java.util.*;
public class PROJECT18 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your gender (M or F): ");
		String gender;
		gender= sc.nextLine();
		System.out.println("First name: ");
		String first_name;
		first_name= sc.nextLine();
		System.out.println("Last name: ");
		String last_name;
		last_name= sc.nextLine();
		System.out.println("Age: ");
		int age;
		age= sc.nextInt();
		
		if ( age >= 20 )
	    {   
			System.out.println("Are you married, " + first_name + "(y or n)?");;
	    
			
			char o;
			o= sc.next().charAt(0);
		    
			if ( o == 'y' )
                System.out.println("Then I shall call you Mrs. " + first_name + " " + last_name + ".");
			else
				System.out.println("*Then I shall call you Ms. " + first_name+ ".");
			
	    }
		else
		{
			System.out.println("Then i shall call you Ms. " + first_name + " " + last_name + ".");
		}
	    
		
		System.out.println("What is your gender (M or F):");
		String gender1;
		gender1= sc.next();
		System.out.println("First name: ");
		String first_name1;
		first_name1= sc.next();
		System.out.println("Last name: ");
		String last_name1;
		last_name1= sc.next();
		System.out.println("Age: ");
		int age1;
		age1= sc.nextInt();
	
		if ( age1 >= 20 )
	    {   
			
			System.out.println("Then I shall call you Mr." +first_name1 + ".");;
			
	    }
		else
		{
			System.out.println("Then i shall call you " + first_name1 + " " + last_name1);
		}
	    
		
    sc.close();
	}

}
