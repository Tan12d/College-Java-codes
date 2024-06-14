import java.util.*;
public class PROJECT10 
{

	public static void main(String[] args) 
    {
		Scanner i= new Scanner(System.in);
        
		System.out.print("Enter today's day: ");
		int day;
		day= i.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int d;
		d= i.nextInt();
		
		int a= (day+ d) % 7;
		
		System.out.print("Today is ");
		
		switch ( day )
		{
		case 0:
			System.out.print("Sunday");
	    break;
		case 1:
		    System.out.print("Monday");
		break;
		case 2:
			System.out.print("Tuesday");
	    break;
		case 3:
			System.out.print("Wednesday");
	    break;
		case 4:
			System.out.print("Thursday");
	    break;
		case 5:
			System.out.print("Friday");
	    break;
		case 6:
			System.out.print("Saturday");
		break;
		}
       
		System.out.print(" and the future day is ");
	    
        switch ( a )
		{
		case 0:
			System.out.print("Sunday");
	    break;
		case 1:
		    System.out.print("Monday");
		break;
		case 2:
			System.out.print("Tuesday");
	    break;
		case 3:
			System.out.print("Wednesday");
	    break;
		case 4:
			System.out.print("Thursday");
	    break;
		case 5:
			System.out.print("Friday");
	    break;
		case 6:
			System.out.print("Saturday");
		break;
		}
		
		
	    
	}

}
