import java.util.*;
public class PROJECT8 
{

	public static void main(String[] args) 
	{
		Scanner o= new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		a= o.nextInt();
		b= o.nextInt();
		c= o.nextInt();
		
		System.out.println("Age of Rahul: " + a);
		System.out.println("Age of Ayush: " + b);
		System.out.println("Age of Ajay: " + c);
		
		if ( a > b && a > c )
		{
			if( b > c )
	        System.out.println("Rahul is elder among them");
			else 
			System.out.println("Rahul is elder among them");
		}
		if ( b > a && b > c )
		{
			if ( a > c ) 
     		System.out.println("Ayush is elder among them");		
			else
	        System.out.println("Ayush is elder among them");
		}
	    if ( c > a &&  c > b )
	    {
	    	if ( a > b )
	        System.out.println("Ajay is elder among them");
	    	else
	        System.out.println("Ajay is elder among them");
	    }	
	    
		o.close();
		
	}

}
