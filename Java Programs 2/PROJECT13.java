import java.util.*;
public class PROJECT13 
{

	public static void main(String[] args) 
	{
		Scanner i= new Scanner(System.in);
		
		int month;
		month= i.nextInt();
		
		int year;
		year= i.nextInt();
		
		System.out.println("month = " + month);
		System.out.println("year = " + year);
		
		switch (month)
		{ 
		    case 1:
		    	System.out.println("January " + year + " had 31 days." );
		    	
		    break;
		    case 2: 
		        int z= year % 4;
		        if (z == 0)
		    	System.out.println("February " + year + " had 29 days.");
		        else 
		        System.out.println("February " + year + " had 28 days.");
		    break;
		    case 3:
		    	System.out.println("March " + year + " had 31 days.");
		    break;
		    case 4:
		    	System.out.println("April " + year + " had 30 days.");
		    break;
		    case 5:
		    	System.out.println("May " + year + " had 31 days.");
		    break;
		    case 6:
		    	System.out.println("June " + year + " had 30 days.");
		    break;
		    case 7:
		    	System.out.println("July " + year + " had 31 days.");
		    break;
		    case 8:
		    	System.out.println("August " + year + " had 31 days.");
		    break;
		    case 9:
		    	System.out.println("September " + year + " had 30 days.");
		    break;
		    case 10:
		    	System.out.println("October " + year + " had 31 days.");
		    break;
		    case 11:
		    	System.out.println("November " + year + " had 30 days.");
		    break;
		    case 12:
		    	System.out.println("December " + year + " had 31 days.");
		    break;
		   
		}
	}

}
